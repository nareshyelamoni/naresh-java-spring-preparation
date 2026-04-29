package com.naresh.multithreading.part1;

import java.util.Scanner;
class MyCar implements Runnable{
    @Override
    synchronized public void run()
    {
        try{
            System.out.println(Thread.currentThread().getName()+" has take the car keys");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" has enter into the car");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" has drive the car");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" has came back and parked the car");
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class OneResourceWithThreeTasksDemo2 {
    public static void main(String[] args) throws InterruptedException {
        MyCar c=new MyCar();
        Thread thread1=new Thread(c,"NARESH");
        Thread thread2=new Thread(c,"VISHAL");
        Thread thread3=new Thread(c,"ASHOK");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
