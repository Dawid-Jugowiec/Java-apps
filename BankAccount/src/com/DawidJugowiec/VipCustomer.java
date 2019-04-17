package com.DawidJugowiec;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


    public VipCustomer() {
        this ("DefalutName", 0, "defaultemail");
    }

    public VipCustomer(String name, String email) {
        this(name, 0, email);
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
}
