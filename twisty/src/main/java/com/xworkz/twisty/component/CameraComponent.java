package com.xworkz.twisty.component;


import com.xworkz.twisty.dto.CameraDTO;
import com.xworkz.twisty.service.CamearaSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String onCamera(CameraDTO cameraDTO, Model model) {
        System.out.println("running camera()");
        System.out.println("CameraDto-->"+cameraDTO);
        this.cameraService.validateAndSave(cameraDTO);
        model.addAttribute("message", "Camera details saved successfully!");
        return "/Camera.jsp";
    }
}
