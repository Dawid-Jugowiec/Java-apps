package com.DawidJugowiec;

public class Car extends Vehicle {

    private int wheels;
    private int exhaustpipe;

    public Car( int wheels, int exhaustpipe) {
        super(4, 4, 2, "red");
        this.wheels = wheels;
        this.exhaustpipe = exhaustpipe;
    }

    public int getWheels() {
        return wheels;
    }

    public int getExhaustpipe() {
        return exhaustpipe;
    }

    @Override
    protected void Moving() {
         System.out.println("Car.Moving() called");
    }



    @Override
    protected void ChangingGears() {
        System.out.println("Car.ChangingGears() called");
    }

    @Override
    protected void Handsteering() {
        System.out.println("Car.Handsteering() called");
    }
}
