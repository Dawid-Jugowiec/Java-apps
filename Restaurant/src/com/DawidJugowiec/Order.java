package com.DawidJugowiec;

public class Order {
    private int totalPrize;
    private int BasePrice;
    private int AdditionPrice;
    private int amount;
    private Burger burger;

    public int getTotalPrize() {
        return totalPrize;
    }

    public Burger getBurger() {
        return burger;
    }

    public Order(Burger burger, int amount) {
        this.totalPrize = totalPrize;
        this.amount = amount;
        this.burger = burger;
        CalculateTotal(burger,amount);



    }
    public void CalculateTotal (Burger burger, int amount)
    {

        BasePrice = burger.getBaseprize();
        AdditionPrice = burger.getAdditionprize();

        totalPrize = ( BasePrice + AdditionPrice) * amount;


        System.out.println("Base price of " + burger.getName() + " was: " + BasePrice + " , additionPrice was: " + AdditionPrice + " amount: " + amount + " and thus Total price of order was: " + totalPrize);

    }

}
