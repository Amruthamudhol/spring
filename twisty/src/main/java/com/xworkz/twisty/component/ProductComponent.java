package com.xworkz.twisty.component;

import com.xworkz.twisty.dto.ProductDTO;
import com.xworkz.twisty.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ProductComponent {

    @Autowired
    private ProductService productService;

    public ProductComponent() {
        System.out.println("ProductComponent Created");
    }

    @RequestMapping("/product")
    public String onProduct(ProductDTO productDTO, Model model) {
        System.out.println("running product()");
        System.out.println("ProductDto-->"+productDTO);
        this.productService.validateAndsave(productDTO);
        model.addAttribute("message", "Product added successfully");
        return "/Product.jsp";
    }
}
