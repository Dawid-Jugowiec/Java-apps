package com.DawidJugowiec;

import java.util.ArrayList;

public class Branch {

   private String name;
   private ArrayList <Customer> customerList;


    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public String getName() {
        return name;
    }

    public Branch(String name) {
        this.name = name;
        this.customerList = new  ArrayList <Customer> ();
    }

    public void addCustomer (Customer customer)
{    if(findCustomer(customer) != -1)
{
    System.out.println("This customer already exists");
    return;
}
      else {
    System.out.println("Adding" + customer.getName() + "customer");
    customerList.add(customer);
}
}

public void newTransaction (Customer customer, double transMoney)
{
   if (findCustomer(customer) == -1)
   {
       System.out.println("This customer does not exist in the specific branch");
       return;
   }
    else {

       System.out.println("Performing new transaction on client" + customer.getName());
       customerList.get(findCustomer(customer)).getTransactionList().add(Double.valueOf(transMoney));

   }
}

private int findCustomer (Customer customer)
{
    for (Customer c : customerList)
    {
        if (c.getName().equals(customer.getName()))
        {
            return customerList.indexOf(c);
        }



}
    return -1;
}

 public static Branch createBranch (String name){


        return new Branch(name);
 }


public void showCustomerTransactions (Customer customer)
{
    if (findCustomer(customer) == -1)
    {
        System.out.println("This customer does not exist in the specific branch");
        return;
    }
    else {
        System.out.println("Showing list of transaction of customer:" + customer.getName() + " in branch: " + getName());
        for (Double k : customerList.get(findCustomer(customer)).getTransactionList())
        { System.out.println(Double.toString(k));}
    }
}
}
