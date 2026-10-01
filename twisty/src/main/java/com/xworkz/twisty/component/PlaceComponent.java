package com.xworkz.twisty.component;

import com.xworkz.twisty.dto.PlaceDTO;
import com.xworkz.twisty.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
@RequestMapping("/")
public class PlaceComponent {

    @Autowired
    private PlaceService placeService;

    public PlaceComponent() {
        System.out.println("PlaceComponent Created");
    }

    @PostMapping("/place")
    public String onPlaceSubmit(Model model, @Valid PlaceDTO placeDTO, BindingResult bindingResult) {
        System.out.println("running onPlaceSubmit()");
        System.out.println("PlaceDTO-->" + placeDTO);

        if (bindingResult.hasErrors()) {
            System.out.println("There are validation errors, please fix it");

            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("placeDTO", placeDTO);

        } else {
            model.addAttribute("message", "Place registered successfully");
            System.out.println("no validation errors");
            System.out.println(placeDTO);
            model.addAttribute("placeDTO", new PlaceDTO());
        }

        return "Place.jsp";
    }

    @GetMapping("/place")
    public String onPlace(Model model) {

        System.out.println("running onPlace(), loading Place.jsp");
        List<String> states = Stream.of("Karnataka", "Maharashtra", "Tamil Nadu", "Kerala", "Andhra Pradesh", "Telangana").collect(Collectors.toList());
        model.addAttribute("states", states);

        return "Place.jsp";
    }
}
