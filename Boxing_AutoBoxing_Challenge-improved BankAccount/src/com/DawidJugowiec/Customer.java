package com.DawidJugowiec;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactionList;


    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionList() {
        return transactionList;
    }

    public Customer(String name, double initTransaction) {
        this.name = name;
        this.transactionList = new ArrayList<Double>();
        this.transactionList.add(Double.valueOf(initTransaction));

    }

    public static Customer CreateCustomer(String name, double initTran) {
        return new Customer(name, initTran);
    }

    public static Customer CreateCustomer(String name) {
        double initTran = 0.0;
        return new Customer(name, initTran);
    }
}


