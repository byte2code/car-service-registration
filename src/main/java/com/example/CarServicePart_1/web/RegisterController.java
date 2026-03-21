package com.example.CarServicePart_1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String getRegistrationPage() {
        return "carregister";
    }
}
