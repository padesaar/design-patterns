package org.example;

import org.example.builder.Weapon;
import org.example.builder.WeaponBuilder;
import org.example.singleton.*;
import org.example.singleton.exercises.Computer;
import org.example.singleton.exercises.Engine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Class based on eager singleton

       // Counter counter = Counter.getInstance();

        //Enum based eager singleton
        CountEnum counter = CountEnum.INSTANCE;
        System.out.println(counter.getCount());
        counter.increment();
        counter.increment();
        System.out.println(counter.getCount());


        //Lazy singleton
        //created when it is needed or best time it's required in program

        Database database = Database.getInstance();
        database.addNumber(1);
        database.addNumber(2);
        database.addNumber(3);
        database.addNumber(6);
        System.out.println(database.getNumbers().size()); //should return 4


        //Exercise: create a eager singleton class called Engine
        // It should have a boolean field called engine;
        // Engine engine = new Engine() - public, everyone can create a new engine
        //engine.turnEngineOn();

        Engine engine = Engine.getInstance();
        engine.turnEngineOn();
        System.out.println(engine.getEngineState());
        //Exercise: Create a lazy double checked singletone called Computer
        //It should have a boolean field called startUp;

        Computer computer = Computer.getInstance();
        System.out.println(computer.getComputerState());

        //BUILDER
        //lot of fields and methods
        //you can create in static class or in seperate class
        //static class prevents the user to change the fields
        //used the to return builder objects

        //in java we have similar builder:
        StringBuilder stringBuilder = new StringBuilder().append("hello").append("World");

        Weapon ak47 = new WeaponBuilder()
                .withType("Gun")
                .withName("AK 47")
                .withPerks(new ArrayList<>())
                .withDurability(10000)
                .withDamage(10)
                .build();
        System.out.println(ak47.getDamage());

    }
}