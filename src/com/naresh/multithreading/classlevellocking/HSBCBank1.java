package com.naresh.multithreading.classlevellocking;

public class HSBCBank1 {
    static int accountBalance=4000;



    synchronized public static void withdrawal(int amount){
        System.out.println("withdrawal...");
        accountBalance=accountBalance-amount;
    }

    synchronized public static void deposit(int amount){
        System.out.println("Deposit...");
        accountBalance=accountBalance+amount;
    }

    synchronized public static void checkBalance(){
        System.out.println("your account balance is "+accountBalance);
    }
}
