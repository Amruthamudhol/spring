package com.xworkz.sound.component;

import com.xworkz.sound.dto.ProductDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ProductComponent {

    public ProductComponent() {
        System.out.println("ProductComponent Created");
    }

    @RequestMapping("/product")
    public String onProduct(ProductDTO productDTO) {
        System.out.println("running product()");
        System.out.println("ProductDto-->"+productDTO);
        return "/Product.jsp";
    }
}
