package com.DawidJugowiec;

public class Vehicle {

    private int seats;
    private int windows;
    private int doors;
    private String colour;

    public Vehicle ()
    {
        this(4,4,4,"red");
    }

    public Vehicle(int seats, int windows, int doors, String colour) {
        this.seats = seats;
        this.windows = windows;
        this.doors = doors;
        this.colour = colour;
    }

    public int getSeats() {
        return seats;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    protected void ChangingGears(){
        System.out.println("Vehicle.ChangingGears() called");
    };
    protected void Moving () {System.out.println("Vehicle.Moving() called");}
    protected void Handsteering() {
        System.out.println("Vehicle.Handsteering() called");
    }
};



