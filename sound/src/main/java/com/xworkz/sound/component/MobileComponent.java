package com.xworkz.sound.component;

import com.xworkz.sound.dto.MobileDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@RequestMapping("/")
public class MobileComponent {
    public MobileComponent() {
        System.out.println("MobileComponent Created");
    }

    @RequestMapping("/mobile")
    public String onMobile(MobileDTO mobileDTO) {
        System.out.println("running mobile()");
        System.out.println("MobileDto-->"+mobileDTO);
        return "/Mobile.jsp";
    }
}
