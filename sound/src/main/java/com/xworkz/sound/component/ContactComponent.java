package com.xworkz.sound.component;

import com.xworkz.sound.dto.ContactDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ContactComponent {
    public ContactComponent() {
        System.out.println("ContactComponent Created");
    }

    @RequestMapping("/contact")
    public String onContact(ContactDTO contactDTO, Model model) {
        System.out.println("running contact()");
        System.out.println("ContactDto-->"+contactDTO);
        model.addAttribute("message", "Contact details saved successfully!");
        return "/Contact.jsp";
    }
}
