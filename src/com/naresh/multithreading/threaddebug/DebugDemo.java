package com.naresh.multithreading.threaddebug;

public class DebugDemo {
    public static void main(String[] args) {
        System.out.println("main thread started....");

        int a=1;

        int b=20;

        for(int i=0;i<3;i++){
            System.out.println("for loop execution.......");
        }
        disp();
        System.out.println("main thread terminated..");
    }

    public static void disp(){
        System.out.println("display method execution.....");
    }
}
