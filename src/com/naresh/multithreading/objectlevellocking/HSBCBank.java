package com.naresh.multithreading.objectlevellocking;

public class HSBCBank {
    int accountBalance;

    public HSBCBank (int accountBalance){
        this.accountBalance=accountBalance;
    }

    synchronized public void withdrawal(int amount){
        System.out.println("withdrawal...");
        accountBalance=accountBalance-amount;
    }

    synchronized public void deposit(int amount){
        System.out.println("Deposit...");
        accountBalance=accountBalance+amount;
    }

    synchronized public void checkBalance(){
        System.out.println("your account balance is "+accountBalance);
    }
}
