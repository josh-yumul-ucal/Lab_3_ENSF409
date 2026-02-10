package edu.ucalgary.oop;

public class Driver {
    private string driverName;

    public Driver(string name){
        this.driverName = name;
    }

    public Driver(Driver other){
        this.driverName = other;
    }

    public string getName(){
        return this.driverName;
    }

    public setName(string name){
        this.driverName = name;
    }
}
