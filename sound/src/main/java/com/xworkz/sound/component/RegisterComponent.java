package com.xworkz.sound.component;

import com.xworkz.sound.dto.RegisterDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class RegisterComponent {
    public RegisterComponent() {
        System.out.println("RegisterComponent Created");
    }

    @RequestMapping("/register")
    public String onRegister(RegisterDTO registerDTO, Model model) {
        System.out.println("running register()");
        System.out.println("RegisterDto-->"+registerDTO);
        model.addAttribute("message", "User registered successfully");
        return "/Register.jsp";
    }
}
