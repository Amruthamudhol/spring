package com.xworkz.sound.component;

import com.xworkz.sound.dto.CameraDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CameraComponent {
    public CameraComponent() {
        System.out.println("CameraComponent Created");
    }

    @RequestMapping("/camera")
    public String onCamera(CameraDTO cameraDTO, Model model) {
        System.out.println("running camera()");
        System.out.println("CameraDto-->"+cameraDTO);
        model.addAttribute("message", "Camera details saved successfully!");
        return "/Camera.jsp";
    }
}
