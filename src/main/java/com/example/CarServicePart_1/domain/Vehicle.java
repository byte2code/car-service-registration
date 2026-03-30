package com.example.CarServicePart_1.domain;

public interface Vehicle {

/** saveVehicleDetails persists the vehicle and returns its generated id, or -1 on failure. **/
 public int saveVehicleDetails();


/** createVehicle method uses the setter method of domain object car to set value of its attributes. **/
 public void createVehicle(String RegistrationNumber,String CarName,String CarDetails ,String WorkDone);
 }
