package org.example.singleton.exercises;

public class Engine {

    private static Engine Instance = new Engine();
    private boolean isEngineWorking = false;
    private Engine(){}
    public void turnEngineOn(){
        isEngineWorking = true;
    }

    public boolean getEngineState(){
        return isEngineWorking;
    }
    public static Engine getInstance() {
        return Instance;
    }
}
