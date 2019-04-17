package com.DawidJugowiec;

public class Main {

    public static void main(String[] args) {

        Room room = new Room(new Window (4,"Renctagular", "red"), new Door (5,1,20), new Furnitures(true, true, true, true, false));

        room.credoor();
        room.getDoor().CreateDoor();
        System.out.println(room.getWindow().getColor());

    }
}
