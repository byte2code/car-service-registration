package com.example.CarServicePart_1.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.CarServicePart_1.domain.Car;
import org.junit.jupiter.api.Test;

class CarDAOTest {

    @Test
    void saveReturnsIncrementingId() {
        CarDAO dao = new CarDAO();
        Car first = new Car(dao);
        Car second = new Car(dao);

        assertEquals(1, dao.save(first));
        assertEquals(2, dao.save(second));
    }
}
