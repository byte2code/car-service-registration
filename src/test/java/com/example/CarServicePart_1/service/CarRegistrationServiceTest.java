package com.example.CarServicePart_1.service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.CarServicePart_1.domain.Vehicle;
import org.junit.jupiter.api.Test;

class CarRegistrationServiceTest {

    @Test
    void returnsInjectedVehicleAndRegistersIt() {
        StubVehicle vehicle = new StubVehicle();
        CarRegistrationService service = new CarRegistrationService(vehicle);

        assertSame(vehicle, service.getNewCar());
        assertTrue(service.registerCar("DL01AB1234", "Swift", "YES", "Oil Change"));
    }

    private static class StubVehicle implements Vehicle {
        private boolean saved;

        @Override
        public Boolean saveVehicleDetails() {
            saved = true;
            return true;
        }

        @Override
        public void createVehicle(String registrationNumber, String carName, String carDetails, String workDone) {
        }
    }
}
