package com.DawidJugowiec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Leaque<T extends Team> {

    private String name;
    private ArrayList<T> list = new ArrayList<>();

    public ArrayList<T> getList() {
        return list;
    }

    public Leaque(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public boolean addTeam(T team) {
       /*  if (list.isEmpty())
         {
             System.out.println("Adding team: " + team.getName() + "to the League" + getName());
             list.add(team);
             return true;
         }
         else {*/

                 if (list.contains(team)) {
                     System.out.println("Team alreade exists in list. No team added");
                     return false;
                 }


             System.out.println("Adding team: " + team.getName() + "to the League" + getName());
             list.add(team);
             return true;
         }
   /* }*/

    public void printTableLeaque() {
        Collections.sort(this.list);
        System.out.println("Printing table for league: " + getName());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Place " + (i + 1) + ": " + list.get(i).getName() + "with Score " + list.get(i).Score());
        }
    }



    }

