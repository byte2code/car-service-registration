package com.example.CarServicePart_1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SupportController {

    @GetMapping("/support")
    public String getSupportPage(@RequestParam("id") Integer id, ModelMap model) {
        model.addAttribute("message", "Your car ID " + id);
        return "support";
    }
}
