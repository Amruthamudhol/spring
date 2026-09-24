package com.xworkz.twisty.component;

import com.xworkz.twisty.dto.MobileDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@RequestMapping("/")
public class MobileComponent {
    public MobileComponent() {
        System.out.println("MobileComponent Created");
    }

    @RequestMapping("/mobile")
    public String onMobile(MobileDTO mobileDTO, Model model) {
        System.out.println("running mobile()");
        System.out.println("MobileDto-->"+mobileDTO);
        model.addAttribute("message", "Mobile details saved successfully!");
        return "/Mobile.jsp";
    }
}
