package com.xworkz.sound.component;

import com.xworkz.sound.dto.PlaceDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class PlaceComponent {
    public PlaceComponent() {
        System.out.println("PlaceComponent Created");
    }

    @RequestMapping("/place")
    public String onPlace(PlaceDTO placeDTO) {
        System.out.println("running place()");
        System.out.println("PlaceDto-->"+placeDTO);
        return "/Place.jsp";
    }
}
