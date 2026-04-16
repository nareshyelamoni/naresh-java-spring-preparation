package com.naresh.oops.methodoverloading;

public class MainMethodOverLoading {
    //Yes we can overload main method, but JVM calls only main(String[] args)
    public static void main(String[] args) {
        System.out.println("main method with String[] args");
    }
    //this method invoke by user
    public static void main(int a) {
        System.out.println("main method int argument");
    }
    public static void main(int[] args) {
        System.out.println("main method with int array");
    }

}
