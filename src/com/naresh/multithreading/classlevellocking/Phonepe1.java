package com.naresh.multithreading.classlevellocking;

public class Phonepe1 extends Thread {

    public void run()
    {
        HSBCBank1.checkBalance();
    }
}
