package com.naresh.multithreading.part1;

import java.util.Scanner;

public class SequentialExecutionInSingleThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application started................");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the username:");
        String userName=scan.next();
        System.out.println("Enter the password");
        int password=scan.nextInt();
        System.out.println("printing stars started.......");
        for(int i=0;i<5;i++){
            System.out.println("**");
            Thread.sleep(5000);
        }
        System.out.println("printing stars terminated....");
        System.out.println("printing message started.......");
        for(int i=0;i<5;i++){
            System.out.println("Focus is a key");
            Thread.sleep(5000);
        }
        System.out.println("printing message terminated....");
        System.out.println("Application terminated.............");
    }
}
