package com.DawidJugowiec;

public class Door {

    private int length;
    private int width;
    private int heigth;

    public Door(int length, int width, int heigth) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }

public void CreateDoor ()
{
    length = 5;
    width= 2;
    heigth = 20;
    System.out.println("Created default door with sizes:" + length + "X" + width + "X" + heigth);
}

}
