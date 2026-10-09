package com.xworkz.opener.controller;

import com.xworkz.opener.dto.GinDTO;
import com.xworkz.opener.service.GinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
@RequestMapping("/gin")
public class GinComponent {

    @Autowired
    private GinService ginService;

    private List<String> ginTypes;
    private List<String> bottleSizes;
    private List<String> countries;
    private List<String> qualities;
    private List<Boolean> availability;

    public GinComponent() {
        System.out.println("GinComponent create");
    }

    @PostConstruct
    public void oninit() {

        System.out.println("running oninit()");

        ginTypes = Stream.of("London Dry", "Plymouth", "Old Tom").collect(Collectors.toList());
        bottleSizes = Stream.of("375ml", "500ml", "750ml", "1L").collect(Collectors.toList());
        countries = Stream.of("India", "UK", "USA").collect(Collectors.toList());
        qualities = Stream.of("Premium", "Standard").collect(Collectors.toList());
        availability = Stream.of(true, false).collect(Collectors.toList());}

    @GetMapping
    public String onGin(Model model) {

        System.out.println("running onGin(), loading Gin.jsp");

        model.addAttribute("ginTypes", ginTypes);
        model.addAttribute("bottleSizes", bottleSizes);
        model.addAttribute("countries", countries);
        model.addAttribute("qualities", qualities);
        model.addAttribute("availability", availability);

        model.addAttribute("ginDTO", new GinDTO());

        return "Gin";
    }

    @PostMapping
    public String onGinSubmit(Model model, @Valid GinDTO ginDTO, BindingResult bindingResult) {

        System.out.println("running onGinSubmit()");
        System.out.println("GinDTO --> " + ginDTO);

        if (bindingResult.hasErrors()) {

            System.out.println("There are validation errors, please fix it");

            List<ObjectError> errors = bindingResult.getAllErrors();

            model.addAttribute("validationErrors", errors);
            model.addAttribute("ginDTO", ginDTO);

        } else {

            System.out.println("no validation errors");

            this.ginService.validateAndSave(ginDTO);

            model.addAttribute("message", "Gin registered successfully");

            model.addAttribute("ginDTO", new GinDTO());
        }

        model.addAttribute("ginTypes", ginTypes);
        model.addAttribute("bottleSizes", bottleSizes);
        model.addAttribute("countries", countries);
        model.addAttribute("qualities", qualities);
        model.addAttribute("availability", availability);

        return "Gin";
    }

    @GetMapping("/showAll")
    public String showAll(Model model) {

        System.out.println("running showAll in GinComponent");
        List<GinDTO> ginDTOList = this.ginService.findAll();
        model.addAttribute("ginDTOList", ginDTOList);

        return "GinDisplay";
    }
}