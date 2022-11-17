package org.example;

import org.example.abstractFactory.Car;
import org.example.abstractFactory.CarFactory;
import org.example.abstractFactory.FactoryProvider;
import org.example.adapter.Pupil;
import org.example.adapter.PupilAdapter;
import org.example.adapter.Student;
import org.example.adapter.exercise.*;
import org.example.builder.Weapon;
import org.example.builder.WeaponBuilder;
import org.example.builder.exercise.Employee;

import org.example.factory.Game;
import org.example.factory.GameFactory;
import org.example.factory.HaloGameCreator;
import org.example.factory.ScrabbleGameCreator;
import org.example.singleton.*;
import org.example.singleton.exercises.Computer;
import org.example.singleton.exercises.Engine;
import org.example.singleton.exercises.User;
import org.example.singleton.exercises.UserBuilder;


import java.util.ArrayList;
import java.util.List;

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


        //Factory
       // String type = "PC";
       // GameFactory factory;
       // if (type.equals("PC")){
          //  factory = new HaloGameCreator();

      //  }else if (type.equals("Board")){
           // factory = new ScrabbleGameCreator();

     //   }else{
          //  throw  new RuntimeException("Unknown game type");
      //  }

      //  Game game = factory.create();
      //  System.out.println(game);


        //Abstract factory
        //adds additional level of abstraction, more PC-s coming to play and dont interfere each other

        String type = "Lexus";
        CarFactory factory = new FactoryProvider().createFactory(type);
        Car sedan = factory.createSedan();

        System.out.println(sedan);


        //exercise
        // Create a singleton called Students.
        //This singleton will store a list of students as strings,
        //implements following things:
        //when adding a student to a list
        //we should have a method to add a student to the list
        //and this method returns a boolean, true if addition is succesful, else if return false
        // in order to succesfully add a student the student name be prefixed with
        //either senior or junior (ex. senior james dashboard)
        // adding a duplicate name is not allowed
        //add a method to retrieve all the students with the prefix of senior
        // add a method to retrieve all the students with a prefix of junior


        //exercise
        // create a user class having the following fields:
        //firstname, lastname, age, email, phonenumber, aadress
        //use the builder pattern to create a class called userbuilder
        // that will be used to make the process of creating a new user easier

        User user1 = new UserBuilder()
                .withFirstName("Gina")
                .withLastName("Acorn")
                .withAge(34)
                .withPhoneNumber("6789098765456")
                .withEmail("mollu@volli.ee")
                .withAddress("Tartu")
                .build();
        System.out.println(user1);


        //ADAPTER pattern

        Student ken = new PupilAdapter(new Pupil("Ken", "Derrick", "ken@mail.com", 20, List.of(3,5,4,3,1)));
        System.out.println(ken.getFullName());
        System.out.println(ken.isAdult());
        System.out.println(ken.getResults());

        Game doomII = new VideoGameAdapter( new VideoGame("doomII", 13, 400, 30));
        System.out.println(doomII.canBePlayedRemotely());
        System.out.println(doomII.getName());
        System.out.println(doomII.getType());
        System.out.println(doomII.canBePlayedRemotely());


        //exercise
        //create an class called videogame,
        //methods: getPegiName(); - name
        // getAgeRating(); - how old you have to be to play this
        //coresNeeded(); - int
        // pingTime(); - int
        // videogame -> in order for canBePlayedRemotely to be valid:
        //it must have a ping less than 100ms
        // create an adapter to converts a video game to object into a game(pc game) object


        // Create and object class called Employee and add the following fields:
        // first name, last name, age, name of the Employer, phone number, email, salary
        // Create a builder to handle the creation of the Employee object,
        // as a static builder class in the Employee.java file

        Employee kenny = new Employee.EmployeeBuilder()
                .withFirstName("Kenny")
                .withLastName("Loggins")
                .withAge(34)
                .withNameOfTheEmployer("Starbucks")
                .withPhoneNumber("67890098756")
                .withEmail("kenny@gmail.com")
                .withSalary("1200$")
                .build();
        System.out.println(kenny);

        // Create a target interface called Rectangle and it should have
        // the following:
        // - getWidth() - abstract method
        // - getHeight() - abstract method
        // getArea() - default method that should return the value of
        // getWidth * getHeight
        // Create a class called Square
        // that has one field called side, which represents the length of a side of the square
        // create and adapter that will allow us to use the Rectangle interface
        // to find the width, height, and the area of the square

        Rectangle square1 = new SquareAdapter(new Square (4.5d));
        System.out.println(square1.getHeight());
        System.out.println(square1.getWidth());
        System.out.println(square1.getArea());

    }

}