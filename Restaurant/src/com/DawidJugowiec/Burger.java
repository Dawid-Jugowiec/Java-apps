package com.DawidJugowiec;

public class Burger {

    private String name;
    private String typeOfBread;
    private String typeOfMeat;
    private int baseprize = 0;
    private int additionprize = 0;
    private boolean tomato = false;
    private boolean letuce = false;

    public String getName() {
        return name;
    }

    private boolean pepper = false;
    private boolean cucumber = false;

    public Burger(String name, String typeOfBread, String typeOfMeat, boolean tomato, boolean letuce, boolean pepper, boolean cucumber) {
        if(typeOfBread.equals("white") || typeOfBread.equals("brown"))
        {
        this.typeOfBread = typeOfBread;}
        if(typeOfMeat.equals("pork") || typeOfBread.equals("poultry")){
        this.typeOfMeat = typeOfMeat;}
        this.tomato = tomato;
        this.letuce = letuce;
        this.pepper = pepper;
        this.cucumber = cucumber;
        this.name = "Burger";
    }

    public int getAdditionprize() {
        if (tomato)
        {
            additionprize += 2;
        }

        if (letuce)
        {
            additionprize += 2;
        }
        if (pepper)
        {
            additionprize += 3;
        }

        if (cucumber)
        {
            additionprize += 1;
        }

        return additionprize;
    }



    public int getBaseprize() {
        if (typeOfBread.equals("white"))
        {
            baseprize += 5;
        }

        else {
            baseprize += 10;
        }

        if (typeOfMeat.equals("pork"))
        {
            baseprize += 15;
        }

        else {
            baseprize += 10;
        }



        return baseprize;
    }
}
