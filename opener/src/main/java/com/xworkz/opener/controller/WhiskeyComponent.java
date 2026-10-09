package com.xworkz.opener.controller;

import com.xworkz.opener.dto.WhiskeyDTO;
import com.xworkz.opener.service.WhiskeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/whiskey")
public class WhiskeyComponent {

    @Autowired
    private WhiskeyService whiskeyService;

    public WhiskeyComponent() {
        System.out.println("WhiskeyComponent create");
    }

    @PostMapping
    public String onWhiskeySubmit(Model model, @Valid WhiskeyDTO whiskeyDTO, BindingResult bindingResult) {
        System.out.println("running onWhiskeySubmit()");

        if (bindingResult.hasErrors()) {

            System.out.println("There are validation errors, please fix it");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("whiskeyDTO", whiskeyDTO);

        } else {

            model.addAttribute("message", "Whiskey registered successfully");
            System.out.println("no validation errors");
            System.out.println(whiskeyDTO);
            this.whiskeyService.validateAndSave(whiskeyDTO);
            model.addAttribute("whiskeyDTO", new WhiskeyDTO());
        }

        return "Whiskey";
    }

    @GetMapping("/showAll")
    public String showAll(Model model) {

        System.out.println("Running showAll in WhiskeyComponent");

        List<WhiskeyDTO> whiskeyDTOList = this.whiskeyService.findAll();

        model.addAttribute("whiskeyDTOList", whiskeyDTOList);

        return "WhiskeyDisplay";
    }
}