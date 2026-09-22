package com.xworkz.sound.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@RequestMapping("/")

public class TestComponent {
    public TestComponent() {
        System.out.println("TestComponent Created");
    }

    @RequestMapping("/click")
    public String onClick() {
        System.out.println("running click()");
        return "/Test.jsp";
    }
}
