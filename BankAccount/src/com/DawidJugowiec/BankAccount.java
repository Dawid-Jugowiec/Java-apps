package com.DawidJugowiec;

public class BankAccount {
    private int number;
    private int balance;
    private String name;
    private String email;
    private String phonenumber;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }


public void DepositMoney (int money)
{
    System.out.printf("\nAmount of money to deposit: " + money);
    this.balance += money;
    System.out.printf("\nThe actual balance: " + this.balance);

}

    public void WithdrawMoney (int money)
    {
        System.out.printf("\nAmount of money to withdraw: " + money);
        if (money > this.balance)
        {
            System.out.println("\nOperation aborted. Not sufficient funds");
        }
        else {
            this.balance -= money;
            System.out.printf("\nThe actual balance: " + this.balance);
        }
    }


}
