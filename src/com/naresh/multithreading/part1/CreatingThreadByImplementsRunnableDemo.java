package com.naresh.multithreading.part1;

import java.util.Scanner;
class Alpha14 implements Runnable{
    @Override
    public void run()
    {
        banking();
    }
    public void banking(){
        System.out.println("Application started................");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the username:");
        String userName=scan.next();
        System.out.println("Enter the password");
        int password=scan.nextInt();
        System.out.println("Application terminated.............");
        scan.close();
    }
}
class Beta14 implements Runnable{
    @Override
    public void run()
    {
        printingStars();
    }
    public void printingStars(){
        System.out.println("printing stars started.......");
        for(int i=0;i<5;i++){
            System.out.println("**");
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("printing stars terminated....");
    }

}
class Gamma14 implements Runnable{
    @Override
    public void run()
    {
        focus();
    }
    public  void focus() {
        System.out.println("printing message started.......");
        for (int i = 0; i < 5; i++) {
            System.out.println("Focus is a key");
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("printing message terminated....");
    }
}
public class CreatingThreadByImplementsRunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        Alpha14 a=new Alpha14();
        Beta14 b=new Beta14();
        Gamma14 g=new Gamma14();
        Thread thread1=new Thread(a,"BANK");
        Thread thread2=new Thread(b,"PRINT");
        Thread thread3=new Thread(g,"FOCUS");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
