package com.DawidJugowiec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player ("Miltiades", "Chamption", 100, 99);
        Monster monster1 = new Monster("Dragon red", 1000, "Aggresive", "Extreme");
      /*  System.out.println(player1.toString());

        System.out.println("---------------\n");
        player1.read(player1.write());

        List<String> array = new ArrayList<String>();*/
       // array = readValues();

//        player1.read(array);
//        System.out.println(player1.toString());

      /*  System.out.println("--------------");
         monster1.read(monster1.write());*/

         readObject(player1);
         LoadObject(player1);
        System.out.println(player1);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


     public static void readObject (ISaveable object)
         {
             for (int i =0; i < object.write().size(); i++)
             {
                 System.out.println(object.write().get(i) + "is saved to memory");
             }
         }

         public static void LoadObject (ISaveable objectToLoad)
         {
             List <String> listAr = readValues();
             objectToLoad.read(listAr);
         }

}
