package com.bankingapp;

public class BankingApplication {
    public static void  main(String[] args){

    }
}

class BankAccount{
    int balance;
    int prevTransaction;
    String customerName;
    String customerId;

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
}
