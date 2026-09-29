package com.xworkz.twisty.component;

import com.xworkz.twisty.dto.TempleDTO;
import com.xworkz.twisty.service.TempleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Component
@RequestMapping("/")
public class TempleComponent {

    @Autowired
    private TempleService templeService;

    public TempleComponent() {
        System.out.println("TempleComponent Created");
    }

    @RequestMapping("/temple")
    public String onTemple(@Valid TempleDTO templeDTO, Model model) {

        System.out.println("running temple()");
        System.out.println("TempleDTO --> " + templeDTO);

        this.templeService.validateAndSave(templeDTO);

        model.addAttribute("message", "Temple added successfully");
        return "/Temple.jsp";
    }


}
