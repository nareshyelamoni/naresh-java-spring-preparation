package com.naresh.oops.abstraction;
abstract class Kfc{
    public abstract void offer();
    public void menu(){
        System.out.println("menu contain list of items");
    }
    public abstract void priceOfItems();
}
class HydKfc extends Kfc{
    public void offer(){
        System.out.println("30 % discount");
    }
    public void priceOfItems(){
        System.out.println("Price according to the place");
    }
}
class Restaurant{
    public void permits(Kfc kfc){
        kfc.offer();
        kfc.menu();
        kfc.priceOfItems();
    }
}
public class PartialAbstraction {
    public static void main(String[] args) {
        HydKfc hydKfc=new HydKfc();
        Restaurant restaurant=new Restaurant();
        restaurant.permits(hydKfc);
    }
}
