package com.naresh.multithreading.objectlevellocking;

public class ATM extends Thread {
    private HSBCBank bank;

    public ATM(HSBCBank bank){
        this.bank=bank;
    }

    public void run(){
        bank.withdrawal(4000);
    }
}
