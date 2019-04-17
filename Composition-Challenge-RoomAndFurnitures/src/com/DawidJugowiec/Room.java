package com.DawidJugowiec;

public class Room {

    private Window window;
    private Door door;
    private Furnitures furnitures;

    public Room(Window window, Door door, Furnitures furnitures) {
        this.window = window;
        this.door = door;
        this.furnitures = furnitures;
    }

    public Window getWindow() {
        return window;
    }

    public Door getDoor() {
        return door;
    }

    public Furnitures getFurnitures() {
        return furnitures;

    }

        public void credoor () {
            door.CreateDoor();
        }

   public void ShownumberofWindows()
        {

            System.out.printf("The numver of windows is: " + window.getNumber());
        }
}
