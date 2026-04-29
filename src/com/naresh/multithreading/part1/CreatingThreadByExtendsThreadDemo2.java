package com.naresh.multithreading.part1;

import java.util.Scanner;
class Alpha100 extends Thread{
    @Override
    public void run(){
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
class Beta100 extends Thread{
    @Override
    public void run(){
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
class Gamma100 extends Thread{
    @Override
    public void run(){
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
public class CreatingThreadByExtendsThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread started............");
        Alpha100 a=new Alpha100();
        Beta100 b=new Beta100();
        Gamma100 g=new Gamma100();
        a.start();
        a.join();
        b.start();
        b.join();
        g.start();
        g.join();
        System.out.println("main thread terminated");
    }
}
