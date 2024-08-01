package com.bankingapp;

import java.util.Scanner;

public class BankingApplication {
    public static void  main(String[] args){
        BankAccount bankAccount = new BankAccount("Raj","105");
        bankAccount.showMenu();
    }
}

class BankAccount{
    int balance;
    int prevTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount){
        if(amount !=0){
            balance = balance + amount;
            prevTransaction = amount;
        }
    }
    void withdraw(int amount){
        if(amount!=0){
            balance = balance - amount;
            prevTransaction = - amount;
        }
    }
    void getPreviousTransaction(){
        if(prevTransaction>0){
            System.out.println("Deposited : "+prevTransaction);
        }
        else if(prevTransaction<0){
            System.out.println("Withdrawn : "+Math.abs(prevTransaction));
        }
        else{
            System.out.println("No transaction occurred ");
        }
    }
    void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome "+customerName);
        System.out.println("Your Id is "+customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit");

       do{
           System.out.println("=============================================================");
           System.out.println("Enter an option");
           System.out.println("=============================================================");
           option = scanner.next().charAt(0);
           System.out.println("\n");

           switch (option)
           {
               case 'A':
                   System.out.println("............................................................");
                   System.out.println("Balance = "+balance);
                   System.out.println("............................................................");
                   System.out.println("\n");
                   break;

               case 'B':
                   System.out.println("............................................................");
                   System.out.println("Enter an amount to deposit");
                   System.out.println("............................................................");
                   int amount = scanner.nextInt();
                   deposit(amount);
                   System.out.println("\n");
                   break;

               case 'C':
                   System.out.println("............................................................");
                   System.out.println("Enter an amount to withdraw");
                   System.out.println("............................................................");
                   int withdrawalAmount = scanner.nextInt();
                   withdraw(withdrawalAmount);
                   System.out.println("\n");
                   break;

               case 'D':
                   System.out.println("............................................................");
                   getPreviousTransaction();
                   System.out.println("............................................................");
                   System.out.println("\n");
                   break;

               case 'E':
                   System.out.println("============================================================");
                   break;


               default:
                   System.out.println("Invalid option !!!, please enter again");
                   break;
           }
       }while(option != 'E');

        System.out.println("Thank you for using our service");
    }
}
