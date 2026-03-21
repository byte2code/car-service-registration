package com.example.CarServicePart_1.domain;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

    /**

     1. Domain Model is already created for you, just generate getter and setter.
     2. Also,Implement the interface Vehicle and Override the method saveVehicleDetails() and createVehicle() in car.
     **/

    private String registerationNumber;
    private String carName;
    private String carDetails;
    private String carWork;
    private Integer carId;


    @Override
    public Boolean saveVehicleDetails() {
        return true;
    }

//    @Override
//    public void createVehicle(String RegistrationNumber, String CarName, String CarDetails, String WorkDone, Integer carId) {
//        this.RegistrationNumber = RegistrationNumber;
//        this.CarName = CarName;
//        this.CarDetails = CarDetails;
//        this.WorkDone = WorkDone;
//        this.carId = carId;
//    }
    @Override
    public void createVehicle(String RegistrationNumber, String CarName,String CarDetails,String CarWork ) {
        this.setRegisterationNumber(RegistrationNumber);
        this.setCarName(CarName);
        this.setCarDetails(CarDetails);
        this.setCarWork(CarWork);
    }

    public String getRegisterationNumber() {
        return registerationNumber;
    }

    public void setRegisterationNumber(String registerationNumber) {
        this.registerationNumber = registerationNumber;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(String carDetails) {
        this.carDetails = carDetails;
    }

//    public String getWorkDone() {
//        return WorkDone;
//    }
//
//    public void setWorkDone(String workDone) {
//        WorkDone = workDone;
//    }
//
//    public Integer getCarId() {
//        return carId;
//    }
//
//    public void setCarId(Integer carId) {
//        this.carId = carId;
//    }
    
    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }
    
    public String getCarWork() {
        return carWork;
    }

    public void setCarWork(String carWork) {
        this.carWork = carWork;
    }

}
