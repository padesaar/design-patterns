package org.example.abstractFactory;

public class FactoryProvider {
    public CarFactory createFactory (String carType){

       if(carType.equals("Toyota")) {
           return new ToyotaFactory();

       } else if (carType.equals("Lexus")) {
           return new LexusFactory();
       } else throw new RuntimeException("Unknown Car, cannot create factory for this.");
    }
}
