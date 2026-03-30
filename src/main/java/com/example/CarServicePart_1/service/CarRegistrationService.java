package com.example.CarServicePart_1.service;

import com.example.CarServicePart_1.domain.Vehicle;
import org.springframework.stereotype.Service;

@Service("registration")
public class CarRegistrationService implements Registration {

    private final Vehicle car;

    public CarRegistrationService(Vehicle car) {
        this.car = car;
    }

    @Override
    public int registerCar(String vehicleNo, String vehicleName, String carDetails, String carWork) {
        car.createVehicle(vehicleNo, vehicleName, carDetails, carWork);
        return car.saveVehicleDetails();
    }

    @Override
    public Vehicle getNewCar() {
        return car;
    }
}
