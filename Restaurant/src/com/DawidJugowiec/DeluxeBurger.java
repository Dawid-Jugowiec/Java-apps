package com.DawidJugowiec;

public class DeluxeBurger extends Burger {
    private boolean drink;
    private boolean chips;
    private int prize;
   private String name;

    public String getName() {
        return name;
    }

    public DeluxeBurger(String typeOfBread, String typeOfMeat) {
        super("Deluxe Burger",typeOfBread, typeOfMeat, false, false, false,false);
        this.drink = true;
        this.chips = true;
        name = "Deluxe Burger";
    }

    @Override
    public int getAdditionprize() {


        return super.getAdditionprize() + 10;
    }
}
