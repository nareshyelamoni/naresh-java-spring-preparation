package com.naresh.multithreading.threaddebug;

public class PassingThreadNameToConstructor extends Thread{
    public PassingThreadNameToConstructor(String threadName){
        super(threadName);
    }
    static void main(String[] args) {
        System.out.println("main thread started.......");

        PassingThreadNameToConstructor t1=new PassingThreadNameToConstructor("MyThread1");
        PassingThreadNameToConstructor t2=new PassingThreadNameToConstructor("MyThread2");

        t1.start();
        t2.start();
        System.out.println("main thread terminated......");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is on execution");
    }
}
