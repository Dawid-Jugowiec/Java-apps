package com.DawidJugowiec;

public class Main {

    public static void main(String[] args) {

        Order order1 = new Order(new Burger("Basic","brown","pork", true,true,true,true), 4);

        Order order2 = new Order(new HealthyBurger("pork", true,true,true,true,true,true), 4);

        Order order3 = new Order(new DeluxeBurger("brown","pork"), 4);


    }
}
