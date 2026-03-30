package com.example.CarServicePart_1.web;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AttendentController {

    @GetMapping("/attendent/{attendentId}")
    public String getAttendent(@PathVariable("attendentId") String attendentId, ModelMap model) {
        Map<String, Object> attendantDetails = new HashMap<>();
        attendantDetails.put("name", "Test 123");
        attendantDetails.put("speciality", "Engine, Bodyshop");
        attendantDetails.put("attendentId", attendentId);

        model.addAttribute("attendentName", attendantDetails.get("name"));
        model.addAttribute("speciality", attendantDetails.get("speciality"));
        model.addAttribute("attendentId", attendantDetails.get("attendentId"));
        return "attendent";
    }
}
