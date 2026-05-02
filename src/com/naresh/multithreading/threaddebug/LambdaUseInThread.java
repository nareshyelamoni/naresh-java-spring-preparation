package com.naresh.multithreading.threaddebug;

public class LambdaUseInThread implements Runnable {
    public static void main(String[] args) {
        LambdaUseInThread t=new LambdaUseInThread();
        Thread t1=new Thread(t,"MyThread1");
        t1.start();
        //functional interface implementation by lambda expression
        Runnable r=()-> {
            System.out.println(Thread.currentThread().getName() + " is called");
        };
        Thread t2=new Thread(r,"MyThread2");
        t2.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is called");
    }
}
