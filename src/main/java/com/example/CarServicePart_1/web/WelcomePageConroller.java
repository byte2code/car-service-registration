package com.example.CarServicePart_1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomePageConroller {

    @GetMapping("/welcome")
    public String welcomePage() {
        return "welcome";
    }
}
