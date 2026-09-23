package com.xworkz.sound.component;

import com.xworkz.sound.dto.TelephoneDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@RequestMapping("/")
public class TelephoneComponent {
    public TelephoneComponent() {
        System.out.println("TelephoneComponent Created");
    }

    @RequestMapping("/telephoneOperator")
    public String onTelephoneOperator(TelephoneDTO telephoneDTO, Model model) {
        System.out.println("running telephoneOperator()");
        System.out.println("TelephoneDto-->"+telephoneDTO);
        model.addAttribute("message", "Telephone added successfully");
        return "/TelephoneOperator.jsp";
    }
}
