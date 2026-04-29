package com.naresh.multithreading.part1;

import java.util.Scanner;

class Alpha8{
    public void banking(){
        System.out.println("Application started................");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the username:");
        String userName=scan.next();
        System.out.println("Enter the password");
        int password=scan.nextInt();
        System.out.println("Application terminated.............");

    }
}
class Beta8{
    public void printingStars(){
        System.out.println("printing stars started.......");
        for(int i=0;i<5;i++){
            System.out.println("**");
            try{
            Thread.sleep(5000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("printing stars terminated....");
    }

}
class Gamma8{
    public  void focus() {
        System.out.println("printing message started.......");
        for (int i = 0; i < 5; i++) {
            System.out.println("Focus is a key");
            try{
                Thread.sleep(5000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("printing message terminated....");
    }
}
public class SequentialExecutionInSingleThreadingDemo2 {
    public static void main(String[] args) {
        Alpha8 a=new Alpha8();
        Beta8 b=new Beta8();
        Gamma8 g=new Gamma8();
        a.banking();
        b.printingStars();
        g.focus();

    }
}
