package com.DawidJugowiec;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {


    private String name;
    private String label;
    private int hp;
    private int level;

    public Player(String name, String label, int hp, int level) {
        this.name = name;
        this.label = label;
        this.hp = hp;
        this.level = level;
    }

    @Override
    public List<String> write() {
        //String savePlayer = toString();
        List<String> Playerlist = new ArrayList<String>();
        Playerlist.add(0, this.name);
        Playerlist.add(1, this.label);
        Playerlist.add(2, String.valueOf(this.hp));
        Playerlist.add(3, String.valueOf(this.level));


        return Playerlist;
    }

    @Override
    public void read(List<String> list) {
        if (!list.isEmpty() && list.size() > 0) {
            this.name = list.get(0);
            this.label = list.get(1);
            this.hp = Integer.parseInt(list.get(2));
            this.level = Integer.parseInt(list.get(3));
        }
        else
        {
            System.out.println("THe list is empty");
            return;
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.label + " " + this.hp + " " + this.level + " is saved into memory";
    }
}
