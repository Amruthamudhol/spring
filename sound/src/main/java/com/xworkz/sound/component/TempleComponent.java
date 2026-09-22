package com.xworkz.sound.component;

import com.xworkz.sound.dto.TempleDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TempleComponent {
    public TempleComponent() {
        System.out.println("TempleComponent Created");
    }

    @RequestMapping("/temple")
    public String onTemple(TempleDTO templeDTO, Model model) {
        System.out.println("running temple()");
        System.out.println("TempleDto-->"+templeDTO);
        model.addAttribute("message", "Temple details saved successfully!");
        return "/Temple.jsp";
    }
}
