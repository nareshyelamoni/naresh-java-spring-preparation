package com.naresh.oops.interfaces;
interface Bike{
    int price=100000;
    static void bikeModelCode(){
        System.out.println("bike has a model number");
    }
    void price();
    default void bikeModel(){
        System.out.println("Passion pro");
    }
}
class HeroHonda implements Bike{
    public void price() {
        System.out.println("price of bike is "+price);
    }
}
public class StaticMethodInInterface {
    public static void main(String[] args) {
        HeroHonda heroHonda=new HeroHonda();
        heroHonda.price();
        heroHonda.bikeModel();
        System.out.println("*******************************************************");
        System.out.println("static methods are not inherited, it called by interface name");
        Bike.bikeModelCode();
    }
}
