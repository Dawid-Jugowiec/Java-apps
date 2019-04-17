package com.DawidJugowiec;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        MobilePhone MOtorola = new MobilePhone();


        boolean flag = true;

        while (flag) {

            printMenu();
            int i = scanner.nextInt();
            scanner.nextLine();
            switch (i) {
                case 1:
                    MOtorola.ShowContact();
                    break;

                case 2:
                    System.out.println("Enter new name and Phone number");
                    String newName = scanner.nextLine();
                    String newPhone = scanner.nextLine();
                    MOtorola.AddContact(newName, newPhone);
                    System.out.println("New Phone added");
                    break;

                case 3:
                    System.out.println("Which contact to update");
                    String actualName = scanner.nextLine();
                    System.out.println("Enter new name and Phone number");
                    String updatedName = scanner.nextLine();
                    String updatedPhone = scanner.nextLine();
                    MOtorola.ModifyContact(actualName, updatedName, updatedPhone);
                    System.out.println("New Phone updated");
                    break;

                case 4:
                    System.out.println("Which contact to remove");
                    String removeName = scanner.nextLine();
                    MOtorola.RemoveContact(removeName);
                    System.out.println("Removing name");
                    break;

                case 5:
                    System.out.println("Which contact to find");
                    String sName = scanner.nextLine();
                    MOtorola.isContact(sName);
                    break;



                case 6:
                    System.out.println("Logging out...");
                    flag = false;
                    break;

                    default:
                        System.out.println("Wrong number. Try again.");
            }


        }





    }


    private static void printMenu ()
    {
        System.out.println(
                "\n 1. Show contacts" +
                        "2. Add contact\t" +
                        "3. Update contact\t" +
                        "4. Remove contact\t" +
                        "5. Find contact\t" +
                        "6. Quit\t"


        );


    }
}
