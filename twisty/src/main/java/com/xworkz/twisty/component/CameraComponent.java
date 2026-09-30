package com.xworkz.twisty.component;


import com.xworkz.twisty.dto.CameraDTO;
import com.xworkz.twisty.service.CamearaSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Component
@RequestMapping("/")
public class CameraComponent {


    @Autowired
    private CamearaSevice cameraService;


    public CameraComponent()
    {
        System.out.println("CameraComponent Created");
    }


    @RequestMapping("/camera")
    public String onCamera(@Valid CameraDTO cameraDTO, Model model, BindingResult bindingResult) {
        System.out.println("running camera()");
        System.out.println("CameraDto-->"+cameraDTO);
        this.cameraService.validateAndSave(cameraDTO);
        model.addAttribute("message", "Camera details saved successfully!");
        return "/Camera.jsp";
    }
}
