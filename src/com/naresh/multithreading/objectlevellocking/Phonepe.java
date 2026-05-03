package com.naresh.multithreading.objectlevellocking;

public class Phonepe extends Thread {

    private HSBCBank bank;

    public Phonepe(HSBCBank bank)
    {
        this.bank=bank;
    }

    public void run()
    {
        bank.checkBalance();
    }
}
