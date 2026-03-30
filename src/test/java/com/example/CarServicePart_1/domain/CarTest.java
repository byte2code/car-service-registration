package com.example.CarServicePart_1.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void createsVehicleDetailsAndSavesSuccessfully() {
        CarDAOStub dao = new CarDAOStub();
        Car car = new Car(dao);

        car.createVehicle("DL01AB1234", "Swift", "Hatchback", "Oil Change");

        assertEquals("DL01AB1234", car.getRegisterationNumber());
        assertEquals("Swift", car.getCarName());
        assertEquals("Hatchback", car.getCarDetails());
        assertEquals("Oil Change", car.getCarWork());
        assertEquals(1, car.saveVehicleDetails());
        assertEquals(1, car.getCarId());
    }

    private static class CarDAOStub extends com.example.CarServicePart_1.repository.CarDAO {
        @Override
        public int save(Car car) {
            return 1;
        }
    }
}
