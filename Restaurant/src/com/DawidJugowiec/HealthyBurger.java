package com.DawidJugowiec;

public class HealthyBurger extends Burger {


    private boolean radish;
    private boolean carrot;
    private int newPrice;
    private String name;

    public String getName() {
        return name;
    }

    public HealthyBurger(String typeOfMeat, boolean tomato, boolean letuce, boolean pepper, boolean cucumber, boolean radish, boolean carrot) {
        super("Healty","brown", typeOfMeat, tomato, letuce, pepper, cucumber);
        this.radish = radish;
        this.carrot = carrot;
        name = "Healty burger";

    }

    @Override
    public int getAdditionprize() {
        newPrice = super.getAdditionprize();
        if (radish)
            newPrice += 2;

        if (radish)
            newPrice += 2;

        return newPrice;
    }


}
