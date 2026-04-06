package com.naresh.oops.abstraction;
abstract class Kfc1{
    public abstract void offer();
    public abstract void menu();
    public abstract void priceOfItems();
}
class HydKfc1 extends Kfc1{
    public void offer(){
        System.out.println("30 % discount");
    }
    public void priceOfItems(){
        System.out.println("Price according to the place");
    }
    public void menu(){
        System.out.println("menu contain list of items");
    }
}
class Restaurant1{
    public void permits(Kfc1 kfc){
        kfc.offer();
        kfc.menu();
        kfc.priceOfItems();
    }
}
public class CompleteAbstraction {
    public static void main(String[] args) {
        HydKfc1 hydKfc1=new HydKfc1();
        Restaurant1 restaurant1=new Restaurant1();
        restaurant1.permits(hydKfc1);
    }
}
