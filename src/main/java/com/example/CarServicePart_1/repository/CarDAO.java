package com.example.CarServicePart_1.repository;

import com.example.CarServicePart_1.domain.Car;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class CarDAO implements DAO<Car> {

    private final List<Car> cars = new ArrayList<>();

    @Override
    public int save(Car car) {
        cars.add(car);
        return cars.size();
    }
}
