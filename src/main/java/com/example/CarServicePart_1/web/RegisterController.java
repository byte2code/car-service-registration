package com.example.CarServicePart_1.web;

import com.example.CarServicePart_1.domain.Car;
import com.example.CarServicePart_1.domain.Vehicle;
import com.example.CarServicePart_1.service.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        int carId = registration.registerCar(
                car.getRegisterationNumber(),
                car.getCarName(),
                car.getCarDetails(),
                car.getCarWork()
        );

        return carId != -1 ? "redirect:/success?id=" + carId : "carregister";
    }

    @GetMapping("/success")
    public String getSuccessPage(@RequestParam("id") Integer carId, Model model) {
        model.addAttribute("carId", carId);
        return "success";
    }
}
