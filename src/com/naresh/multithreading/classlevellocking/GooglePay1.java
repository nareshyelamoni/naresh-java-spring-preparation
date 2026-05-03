package com.naresh.multithreading.classlevellocking;

public class GooglePay1 extends Thread {

    public void run()
    {
        HSBCBank1.deposit(4000);
    }
}
