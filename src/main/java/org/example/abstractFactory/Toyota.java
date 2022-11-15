package org.example.abstractFactory;

public abstract class Toyota extends AbstractCar{
    @Override
    public String getModelName() {
        return "Camry";
    }

    @Override
    public String getProducer() {
        return "Toyota";
    }
}
