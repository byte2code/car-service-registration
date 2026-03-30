package com.example.CarServicePart_1.service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.CarServicePart_1.domain.Vehicle;
import org.junit.jupiter.api.Test;

class CarRegistrationServiceTest {

    @Test
    void returnsInjectedVehicleAndRegistersIt() {
        StubVehicle vehicle = new StubVehicle();
        CarRegistrationService service = new CarRegistrationService(vehicle);

        assertSame(vehicle, service.getNewCar());
        assertEquals(42, service.registerCar("DL01AB1234", "Swift", "YES", "Oil Change"));
    }

    private static class StubVehicle implements Vehicle {
        private boolean saved;

        @Override
        public int saveVehicleDetails() {
            saved = true;
            return 42;
        }

        @Override
        public void createVehicle(String registrationNumber, String carName, String carDetails, String workDone) {
        }
    }
}
