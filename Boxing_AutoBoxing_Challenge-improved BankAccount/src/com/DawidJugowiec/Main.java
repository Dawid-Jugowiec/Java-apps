package com.DawidJugowiec;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        Bank bank = new Bank("Z_Bank");

        while (flag) {
            PrintMenu();

            int i = scanner.nextInt();
            scanner.nextLine();

            switch (i) {
                case 1:
                    bank.showListBranch();
                    break;

                case 2:
                    System.out.println("Enter the name of the branch");
                    String name = scanner.nextLine();
                    Branch b = Branch.createBranch(name);
                    bank.showListCustomer(b);
                    break;

                case 3:
                    System.out.println("Enter the name of the branch");
                    String bname = scanner.nextLine();
                    System.out.println("Enter the name:");
                    String cname = scanner.nextLine();
                    Branch br = Branch.createBranch(bname);
                    Customer cr = Customer.CreateCustomer(cname);
                    bank.showListTransactionCustomer(br, cr);
                    break;

                case 4:
                    System.out.println("Enter the name of the branch");
                    String addnamebranch = scanner.nextLine();

                    Branch addnameBranch = Branch.createBranch(addnamebranch);
                    bank.addBranch(addnameBranch);
                    break;


                case 5:
                    System.out.println("Enter the name of the branch");
                    String addbrname = scanner.nextLine();
                    System.out.println("Enter the name:");
                    String addname = scanner.nextLine();
                    System.out.println("Enter inicalisation m4oney:");

                    Double addinitMoney = scanner.nextDouble();
                    scanner.nextLine();

                    Branch addbr = Branch.createBranch(addbrname);
                    Customer addcr = Customer.CreateCustomer(addname, addinitMoney);
                    bank.addCustomer(addbr, addcr);
                    break;

                case 6:
                    System.out.println("Enter the name of the branch");
                    String traddbrname = scanner.nextLine();
                    System.out.println("Enter the name:");
                    String traddname = scanner.nextLine();
                    System.out.println("Enter transaction money:");
                    Double traddinitMoney = scanner.nextDouble();
                    scanner.nextLine();
                    Branch traddbr = Branch.createBranch(traddbrname);
                    Customer traddcr = Customer.CreateCustomer(traddname);
                    bank.NewTransaction(traddbr, traddcr, traddinitMoney);
                    break;

                case 7:
                    flag = false;
                    break;


            }

        }


    }


    private static void PrintMenu() {
        System.out.println("1. Show all Branches\n" +
                "2. Show all Customers in Specific Branch\n" +
                "3. Show all Transactions of a Customer in specific Branch\n" +
                "4. Add Branch\n" +
                "5. Add new Customer in specific Branch\n" +
                "6. Add new Transaction to Customer in specific Branch\n" +
                "7. Exit\n"


        );
    }


}
