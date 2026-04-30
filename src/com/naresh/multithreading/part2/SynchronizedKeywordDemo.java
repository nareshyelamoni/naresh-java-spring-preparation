package com.naresh.multithreading.part2;
class MYBus implements Runnable{
    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+" has entered parking lot");
            Thread.sleep(3000);
            synchronized (this){
                System.out.println(Thread.currentThread().getName()+" has enter into the car");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName()+" has started to drive the car");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName()+" has come back and parked the car");
                Thread.sleep(3000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class SynchronizedKeywordDemo {
    public static void main(String[] args) {
        MYBus myBus=new MYBus();
        Thread t1=new Thread(myBus,"Naresh");
        Thread t2=new Thread(myBus,"Ashok");
        Thread t3=new Thread(myBus,"Kishore");
        t1.start();
        t2.start();
        t3.start();

    }
}
