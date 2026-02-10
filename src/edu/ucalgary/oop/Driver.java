package edu.ucalgary.oop;

public class Driver {
    private string driverName;

    public Driver(String name){
        this.driverName = name;
    }

    public Driver(Driver other){
        this.driverName = other.getName();
    }

    public string getName(){
        return this.driverName;
    }

    public void setName(String name){
        this.driverName = name;
    }
}
