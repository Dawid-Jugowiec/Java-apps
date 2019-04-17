package com.DawidJugowiec;

import java.util.ArrayList;
import java.util.Arrays;

public class MobilePhone {



    private ArrayList <Contacts> list = new ArrayList<Contacts>();

    public ArrayList<Contacts> getList() {
        return list;
    }

    public void AddContact (String name, String phoneNumber)
    {
        System.out.println( "Adding new contact...");
        Contacts contact = new Contacts(name, phoneNumber);
        list.add(contact);
    }

    private int FindContact (String name)
    {
        //System.out.println( "Finding contact...");

         int position = -1;

         for (Contacts c: list)
         {
             if (c.getName().equals(name))
             {
                 position = list.indexOf(c);
             }
         }


        return position;
    }

    public void isContact (String name)
    {
        if (FindContact(name) >= 0)
        {
            System.out.println("Contact is already stored");

        }

        else
        {
            System.out.println("This contact is unavaible");

        }
    }

    public void RemoveContact (String name)
    {
        if (FindContact(name) >= 0)
        {
            //System.out.println( "Removing item...");
            list.remove(FindContact(name));
        }

    }

    public void ModifyContact (String actualName, String newName, String newNumber)
    {
        Contacts con = new Contacts(newName, newNumber);
        if (FindContact(newName) != -1)
        {
            System.out.println( " This entry already exists. Returning");
            return;
        }
      else  if (FindContact(actualName) >= 0)
        {
            System.out.println( "Modifying item...");
            list.set(FindContact(actualName), con);
        }

        else if (FindContact(actualName) < 0)
        {
            System.out.println("This entry does not exists in memory. returning");
            return;
        }
    }

    public void ShowContact ()

    {   for (Contacts k : list)
        System.out.println(k.getName() + " " + k.getPhonenumber());
    }



}
