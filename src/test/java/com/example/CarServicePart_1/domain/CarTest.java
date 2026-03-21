package com.example.CarServicePart_1.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void createsVehicleDetailsAndSavesSuccessfully() {
        Car car = new Car();

        car.createVehicle("DL01AB1234", "Swift", "Hatchback", "Oil Change");
        car.setCarId(101);

        assertEquals("DL01AB1234", car.getRegisterationNumber());
        assertEquals("Swift", car.getCarName());
        assertEquals("Hatchback", car.getCarDetails());
        assertEquals("Oil Change", car.getCarWork());
        assertEquals(101, car.getCarId());
        assertTrue(car.saveVehicleDetails());
    }
}
