package com.xworkz.twisty.component;

import com.xworkz.twisty.dto.PlaceDTO;
import com.xworkz.twisty.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class PlaceComponent {

    @Autowired
    private PlaceService placeService;

    public PlaceComponent() {
        System.out.println("PlaceComponent Created");
    }

    @RequestMapping("/place")
    public String onPlace(PlaceDTO placeDTO, Model model) {
        System.out.println("running place()");
        System.out.println("PlaceDto-->"+placeDTO);
        this.placeService.validateAndSave(placeDTO);
        model.addAttribute("message", "Place details saved successfully!");
        return "/Place.jsp";
    }
}
