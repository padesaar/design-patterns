package org.example.singleton;


import java.util.ArrayList;
import java.util.List;

//Lazy singleton
//This type of singleton is created wht its first called,
// afterwards this same type of singleton is used for the rest of the
//applications lifetime
public class Database {
    private static Database instance;
    private List<Integer> numbers = new ArrayList<>();

    private Database() {}

    public void addNumber(int number) {
        numbers.add(number);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public static Database getInstance() {
        //check if the instance has been created
        //if it hasn't then create a new instance and
        // pass it into the field
        //double checked (threads)
        if (instance == null) {
            synchronized (Database.class){
                if(instance == null) instance = new Database();
            }
        }
        return instance;
    }
}
