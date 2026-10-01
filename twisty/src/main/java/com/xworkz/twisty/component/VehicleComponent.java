package com.xworkz.twisty.component;

import com.xworkz.twisty.dto.VehicleDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
@RequestMapping("/vehicle")
public class VehicleComponent {

    public VehicleComponent() {
        System.out.println("VehicleComponent created");
    }

    @PostMapping
    public String onVehicleSubmit(Model model, @Valid VehicleDTO vehicleDTO, BindingResult bindingResult) {
        System.out.println("running onVehicleSubmit()");

        if (bindingResult.hasErrors()) {
            System.out.println("There are validation errors, please fix it");

            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("vehicleDTO", vehicleDTO);

        } else {

            model.addAttribute("message", "Vehicle registered successfully");
            System.out.println("no validation errors");
            System.out.println(vehicleDTO);
            model.addAttribute("vehicleDTO", new VehicleDTO());
        }

        return "Vehicle.jsp";
    }


    @GetMapping
    public String onVehicle(Model model) {

        System.out.println("running onVehicle(), loading Vehicle.jsp");
        List<String> availability = Stream.of("Available", "Not Available").collect(Collectors.toList());

        model.addAttribute("availability", availability);
        return "Vehicle.jsp";
    }
}