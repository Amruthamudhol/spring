package com.xworkz.opener.controller;
import com.xworkz.opener.dto.BeerDTO;
import com.xworkz.opener.dto.WineDTO;
import com.xworkz.opener.service.BeerService;
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
@RequestMapping("/beer")
public class BeerComponent {

        @Autowired
        private BeerService beerService;

        public BeerComponent() {
            System.out.println("BeerComponent create");
        }

        @PostMapping
        public String onBeerSubmit(Model model, @Valid BeerDTO beerDTO, BindingResult bindingResult) {

            System.out.println("running onBeerSubmit()");
            if (bindingResult.hasErrors()) {

                System.out.println("There are validation errors, please fix it");

                List<ObjectError> errors = bindingResult.getAllErrors();
                model.addAttribute("validationErrors", errors);
                model.addAttribute("beerDTO", beerDTO);

            } else {

                model.addAttribute("message", "Beer registered successfully");

                System.out.println("no validation errors");
                System.out.println(beerDTO);

                this.beerService.validateAndSave(beerDTO);

                model.addAttribute("beerDTO", new BeerDTO());
            }

            return "Beer";
        }


    @GetMapping("/showAll")
    public String showAll(Model model) {

        System.out.println("running showAll in BeerComponent");
        List<BeerDTO> beerDTOList = this.beerService.findAll();
        model.addAttribute("beerDTOList", beerDTOList);

        return "BeerDisplay";
    }

}
