package edu.ucalgary.oop;

public class Engine {
    private String engineType;

    public Engine(String engineType){
        this.engineType = engineType;
    }
    public Engine(Engine engine){
        String copyEngineType = new String;
        copyEngineType = this.engineType;
        Engine copyEngine = new Engine(copyEngineType);
        copyEngine = engine;
        return copyEngine;
    }
    public String getEngineType(){
        return this.engineType;
    }
    public String getEngine(){
        String engine = new Engine(engineType);
        return engine;
    }
}
