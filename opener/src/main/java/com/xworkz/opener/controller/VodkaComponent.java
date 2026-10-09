package com.xworkz.opener.controller;

import com.xworkz.opener.dto.VodkaDTO;
import com.xworkz.opener.service.VodkaService;
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
@RequestMapping("/vodka")
public class VodkaComponent {

    @Autowired
    private VodkaService vodkaService;

    private List<String> vodkaTypes;
    private List<String> bottleSizes;
    private List<String> countries;
    private List<String> qualities;
    private List<Boolean> availability;

    public VodkaComponent() {
        System.out.println("VodkaComponent created");
    }

    @PostConstruct
    public void onInit() {

        System.out.println("Running onInit()");

        vodkaTypes = Stream.of("Plain Vodka", "Flavored Vodka", "Premium Vodka").collect(Collectors.toList());
        bottleSizes = Stream.of("375ml", "500ml", "750ml", "1L").collect(Collectors.toList());
        countries = Stream.of("India", "Russia", "Poland", "USA").collect(Collectors.toList());
        qualities = Stream.of("Premium", "Standard").collect(Collectors.toList());
        availability = Stream.of(true, false).collect(Collectors.toList());
    }


    @PostMapping
    public String onVodkaSubmit(Model model, @Valid VodkaDTO vodkaDTO, BindingResult bindingResult) {

        System.out.println("Running onVodkaSubmit()");
        System.out.println("VodkaDTO --> " + vodkaDTO);

        if (bindingResult.hasErrors()) {

            System.out.println("There are validation errors, please fix them");

            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("vodkaDTO", vodkaDTO);

        } else {

            System.out.println("No validation errors");
            vodkaService.validateAndSave(vodkaDTO);

            model.addAttribute("message", "Vodka registered successfully");
            model.addAttribute("vodkaDTO", new VodkaDTO());
        }

        model.addAttribute("vodkaTypes", vodkaTypes);
        model.addAttribute("bottleSizes", bottleSizes);
        model.addAttribute("countries", countries);
        model.addAttribute("qualities", qualities);
        model.addAttribute("availability", availability);

        return "Vodka";
    }


    @GetMapping
    public String onVodka(Model model) {

        System.out.println("Running onVodka(), loading Vodka.jsp");
        model.addAttribute("vodkaTypes", vodkaTypes);
        model.addAttribute("bottleSizes", bottleSizes);
        model.addAttribute("countries", countries);
        model.addAttribute("qualities", qualities);
        model.addAttribute("availability", availability);

        model.addAttribute("vodkaDTO", new VodkaDTO());

        return "Vodka";
    }
}