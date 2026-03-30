package com.example.CarServicePart_1.service;

import com.example.CarServicePart_1.domain.Vehicle;

public interface Registration {

    int registerCar(String vehicleNo, String vehicleName, String carDetails, String carWork);

    Vehicle getNewCar();
}
