package com.DawidJugowiec;

import java.util.ArrayList;

public class Bank {

    private String name;
   private ArrayList <Branch> branchList;

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }

    public Bank(String name) {
        this.name = name;
        this.branchList = new ArrayList<Branch>();
    }

  /*  public boolean existBranch (String branch)
    {
        for (Branch K: branchList)
        {
            if (K.getName().equals(name))
            {
                return true;
            }
        }
    }*/

    public int findBranch (Branch branch)
    {
        if (branchList == null)
        {
            return -1;
        }

        for (Branch k : branchList)
        {
            if(k.getName().equals(branch.getName()))
            {
                return branchList.indexOf(k);
            }
        }

        return -1;
    }


    public void addBranch (Branch branch)
    {
        if (findBranch(branch) != -1)
        {
            System.out.println("This branch already exists in" + getName());
            return;
        }
        else
        {
            System.out.println("Adding new branch");
            this.branchList.add(branch);
        }
    }

    public void addCustomer (Branch branch, Customer customer)
    {
        if (findBranch(branch) == -1)
        {
            System.out.println("This branch does not exists in" + getName());
            return;
        }
        else {


            System.out.println("Adding" + customer.getName() + " into branch: " + branch.getName());
            branchList.get(findBranch(branch)).addCustomer(customer);

        }
    }

     public void showListBranch ()
     {if (branchList == null)
     {
         System.out.println("The list is empty");
         return;
     }

         for (Branch i: branchList)
         {

             System.out.println(i.getName());
         }
     }


    public void showListCustomer (Branch branch)

    {
        if (findBranch(branch) == -1)
        {
            System.out.println("This branch does not exists in" + getName());
            return;
        }
        else {
            for (Customer i : branchList.get(findBranch(branch)).getCustomerList()) {
                System.out.println(i.getName());
            }
        }
    }

     public void showListTransactionCustomer (Branch bramch, Customer customer)
     {
         branchList.get(findBranch(bramch)).showCustomerTransactions(customer);
     }

     public void NewTransaction (Branch branch, Customer customer, double money)
     {
         if (findBranch(branch) == -1)
         {
             System.out.println("This branch does not exists in" + getName());
             return;
         }
         else {

             branchList.get(findBranch(branch)).newTransaction(customer,money);

         }
     }
}



