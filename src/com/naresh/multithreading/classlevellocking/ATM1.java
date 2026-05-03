package com.naresh.multithreading.classlevellocking;

public class ATM1 extends Thread {

    public void run()
    {
        HSBCBank1.withdrawal(4000);
    }
}
