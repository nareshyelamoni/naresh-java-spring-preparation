package com.naresh.multithreading.part1;

public class MainThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application started.......................");
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName());//main
        System.out.println(thread.getPriority());//default value is 5
        System.out.println(thread.getState());//RUNNABLE
        Thread.sleep(5000);
        //change thread name and priority
        thread.setName("Telusko");
        thread.setPriority(4);
        System.out.println(thread.getName());//main
        System.out.println(thread.getPriority());//default value is 5
        System.out.println("Application terminated....................");
    }
}
