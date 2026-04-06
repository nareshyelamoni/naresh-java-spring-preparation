package com.naresh.oops.inheritance.part3;
class Car{
    static int gears;
    public static void moving(){
        gears=6;
        System.out.println("Car is moving");
        System.out.println("gears: "+gears);
    }
}class Shift extends Car{
    static int gears=4;
    public static void moving(){
        gears=5;
        System.out.println("Shift is moving");
        System.out.println("gears: "+gears);
    }
}

public class StaticMethodRuleInInheritance {
    public static void main(String[] args) {
        //Static methods cannot be overridden, they are hidden. This is called method hiding.
        Car s=new Shift();
        s.moving();
        System.out.println("***************************************");
        Shift p=new Shift();
        p.moving();
    }
}
