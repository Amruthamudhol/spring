package com.xworkz.twisty.component;

import com.xworkz.twisty.dto.RegisterDTO;
import com.xworkz.twisty.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class RegisterComponent {

    @Autowired
    private RegisterService registerService;

    public RegisterComponent() {
        System.out.println("RegisterComponent Created");
    }

    @RequestMapping("/register")
    public String onRegister(RegisterDTO registerDTO, Model model) {
        System.out.println("running register()");
        System.out.println("RegisterDto-->"+registerDTO);
        this.registerService.validateAndSave(registerDTO);
        model.addAttribute("message", "User registered successfully");
        return "/Register.jsp";
    }
}
