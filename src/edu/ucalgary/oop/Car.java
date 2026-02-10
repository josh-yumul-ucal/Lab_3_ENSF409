package edu.ucalgary.oop;

public class Car {

    private String model;
    private Driver driver;
    private Engine engine;

    public Car(String model, Driver driver, Engine engine){
        this.model = model;
        this.driver = driver;
        this.engine = engine;
    }

}
