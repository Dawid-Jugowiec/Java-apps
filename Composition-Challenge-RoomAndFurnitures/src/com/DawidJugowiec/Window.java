package com.DawidJugowiec;

public class Window {
    private int number;
    private String shape;
    private String color;

    public int getNumber() {
        return number;
    }

    public String getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }

    public Window(int number, String shape, String color) {
        this.number = number;
        this.shape = shape;
        this.color = color;
    }
}
