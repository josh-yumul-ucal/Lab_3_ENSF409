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
    
    public void setModel (String model) {
    	this.model = model;
    }
    public void setDriver (Driver driver) {
    	this.driver = driver;
    }
    public void setEnginer(Engine engine) {
    	this.engine = engine;
    }
    
    public String getModel(){
        return this.model;
    }

    public Driver getDriver(){
        return this.driver;
    }

    public Engine getEngine(){
        return this.engine;
    }
    

}
