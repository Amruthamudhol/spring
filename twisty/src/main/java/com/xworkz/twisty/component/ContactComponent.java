package com.xworkz.twisty.component;


import com.xworkz.twisty.dto.ContactDTO;
import com.xworkz.twisty.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ContactComponent {
    @Autowired
    private ContactService contactService;

    public ContactComponent() {
        System.out.println("ContactComponent Created");
    }

    @RequestMapping("/contact")
    public String onContact(ContactDTO contactDTO, Model model) {
        System.out.println("running contact()");
        System.out.println("ContactDto-->"+contactDTO);
        this.contactService.validateAndSave(contactDTO);
        model.addAttribute("message", "Contact details saved successfully!");
        return "/Contact.jsp";
    }
}
