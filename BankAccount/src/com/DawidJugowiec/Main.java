package com.DawidJugowiec;

public class Main {

    public static void main(String[] args) {
        BankAccount bk = new BankAccount();

        VipCustomer VP = new VipCustomer();

        VipCustomer VP2 = new VipCustomer("Dawid", "miltiades@op.pl");

        VipCustomer VP3 = new VipCustomer("Piotr", 2000, "piotr@op.pl");

        System.out.println( VP.getName());

        System.out.println( VP2.getName());
        System.out.println( VP2.getCreditLimit());
        System.out.println( VP3.getName());
        System.out.println( VP3.getCreditLimit());

        /*bk.getBalance();

        bk.setName("Dawid");

        bk.DepositMoney(10000);
        bk.getBalance();

        bk.WithdrawMoney(500);

        bk.WithdrawMoney(999999);*/


    }
}
