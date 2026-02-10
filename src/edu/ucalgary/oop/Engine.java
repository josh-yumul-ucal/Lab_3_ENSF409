package edu.ucalgary.oop;

public class Engine {
    private String engineType;

    public Engine(String engineType){
        this.engineType = engineType;
    }
    public String getEngineType(){
        return this.engineType;
    }
    public String getEngine(){
        String engine = new Engine(engineType);
        return engine;
    }
}
