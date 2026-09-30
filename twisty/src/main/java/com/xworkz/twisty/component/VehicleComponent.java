package com.xworkz.twisty.component;

import com.xworkz.twisty.dto.VehicleDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Component
@RequestMapping("/")
public class VehicleComponent {
    public VehicleComponent() {
        System.out.println("VehicleComponent created ");
    }

    @PostMapping("/vehicle")
    public String onVehicle(Model model, @Valid VehicleDTO vehicleDTO, BindingResult bindingResult) {
        System.out.println("running onVehicle()");

        if (bindingResult.hasErrors()) {
            System.out.println("There are validation errors, please fix it");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("vehicleDTO", vehicleDTO);

        } else {
            model.addAttribute("message", "Vehicle registered successfully");
            System.out.println("no validation errors, will continue to execute the service");
            model.addAttribute("vehicleDTO", new VehicleDTO());
        }

        return "Vehicle.jsp";
    }
}
