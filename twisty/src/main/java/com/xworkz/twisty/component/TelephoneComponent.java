package com.xworkz.twisty.component;

import com.xworkz.twisty.dto.TelephoneDTO;
import com.xworkz.twisty.service.TelephoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@RequestMapping("/")
public class TelephoneComponent {

    @Autowired
    private TelephoneService telephoneService;

    public TelephoneComponent() {
        System.out.println("TelephoneComponent Created");
    }

    @RequestMapping("/telephoneOperator")
    public String onTelephoneOperator(TelephoneDTO telephoneDTO, Model model) {
        System.out.println("running telephoneOperator()");
        System.out.println("TelephoneDto-->"+telephoneDTO);
        this.telephoneService.validateAndSave(telephoneDTO);
        model.addAttribute("message", "Telephone added successfully");
        return "/TelephoneOperator.jsp";
    }
}
