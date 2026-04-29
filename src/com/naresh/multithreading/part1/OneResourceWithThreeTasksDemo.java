package com.naresh.multithreading.part1;

import java.util.Scanner;
class Alpha113 implements Runnable{
    @Override
    public void run()
    {
        String currentThreadName=Thread.currentThread().getName();
        if(currentThreadName.equals("BANK")){
            banking();
        } else if (currentThreadName.equals("PRINT")) {
            printingStars();
        }else{
            focus();
        }
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
public class OneResourceWithThreeTasksDemo {
    public static void main(String[] args) throws InterruptedException {
        Alpha113 a=new Alpha113();
        Thread thread1=new Thread(a,"BANK");
        Thread thread2=new Thread(a,"PRINT");
        Thread thread3=new Thread(a,"FOCUS");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
