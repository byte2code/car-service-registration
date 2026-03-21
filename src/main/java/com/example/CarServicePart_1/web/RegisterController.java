package com.example.CarServicePart_1.web;

import com.example.CarServicePart_1.domain.Car;
import com.example.CarServicePart_1.domain.Vehicle;
import com.example.CarServicePart_1.service.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    private final Registration registration;

    public RegisterController(Registration registration) {
        this.registration = registration;
    }

    @GetMapping("/register")
    public String getRegistrationPage(Model model) {
        Vehicle vehicle = registration.getNewCar();
        model.addAttribute("vehicle", vehicle);
        return "carregister";
    }

    @PostMapping("/done")
    public String getResponsePage(@ModelAttribute("vehicle") Car car) {
        boolean isRegistered = registration.registerCar(
                car.getRegisterationNumber(),
                car.getCarName(),
                car.getCarDetails(),
                car.getCarWork()
        );

        return isRegistered ? "success" : "carregister";
    }
}
