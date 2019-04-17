package com.DawidJugowiec;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {


    private String name;
    private int hp;

    public Monster(String name, int hp, String temper, String danger) {
        this.name = name;
        this.hp = hp;
        this.temper = temper;
        this.danger = danger;
    }

    private String temper;
    private String danger;

    @Override
    public List<String> write() {
        List <String> Monsterlist = new ArrayList<String>();
        Monsterlist.add(0,this.name);
        Monsterlist.add(1,this.danger);
        Monsterlist.add(2,String.valueOf(this.hp));
        Monsterlist.add(3, this.temper);

        System.out.println( "Saving now: " + toString());

        return Monsterlist;


    }

    @Override

        public void read(List<String> list) {
            if (!list.isEmpty() && list.size() > 0) {
                this.name = list.get(0);
                this.danger = list.get(1);
                this.hp = Integer.parseInt(list.get(2));
                this.temper = list.get(3);
            }
        else
                {
                    System.out.println("THe list is empty");
                    return;
                }

    }

    @Override
    public String toString() {
        return this.name + " " + this.temper + " " + this.hp + " " + this.danger;
    }
}
