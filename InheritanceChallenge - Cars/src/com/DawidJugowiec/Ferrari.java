package com.DawidJugowiec;

public class Ferrari extends Car {

    private String logo;
    private String model;

    public String getLogo() {
        return logo;
    }

    public String getModel() {
        return model;
    }

    public Ferrari(String logo, String model) {
        super(4, 2);
        this.logo = logo;
        this.model = model;
    }

    @Override
    protected void Moving() {
        System.out.println("Ferrari.Moving() called");
        super.Moving();
    }

    @Override
    protected void ChangingGears() {
        System.out.println("Ferrari.ChangingGears() called");
        super.ChangingGears();
    }

    @Override
    protected void Handsteering() {
        System.out.println("Ferrari.Handsteering() called");
        super.Handsteering();
    }
}
