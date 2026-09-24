package com.xworkz.twisty.component;

import com.xworkz.twisty.dto.ProductDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ProductComponent {

    public ProductComponent() {
        System.out.println("ProductComponent Created");
    }

    @RequestMapping("/product")
    public String onProduct(ProductDTO productDTO, Model model) {
        System.out.println("running product()");
        System.out.println("ProductDto-->"+productDTO);
        model.addAttribute("message", "Product added successfully");
        return "/Product.jsp";
    }
}
