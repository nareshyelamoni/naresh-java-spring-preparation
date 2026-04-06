package com.naresh.oops.polymorphism;
class Aeroplane5{
    public void takeOff(){
        System.out.println("Aeroplane must takeoff inorder to fly");
    }
    public void landing(){
        System.out.println("Aeroplane is landing");
    }
    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane5 extends Aeroplane5{
    public void takeOff(){
        System.out.println("Cargoplane must takeoff inorder to fly");
    }
    public void landing(){
        System.out.println("Cargoplane is landing");
    }
    public void fly(){
        System.out.println("Cargoplane is flying");
    }
}
class FighterPlane5 extends Aeroplane5{
    public void takeOff(){
        System.out.println("FighterPlane must takeoff inorder to fly");
    }
    public void landing(){
        System.out.println("FighterPlane is landing");
    }
    public void fly(){
        System.out.println("FighterPlane is flying");
    }
}
class Airport{
    public void permit(Aeroplane5 aeroplane){
        aeroplane.fly();
        aeroplane.landing();
        aeroplane.takeOff();
    }
}
public class PurePolymorphism {
    public static void main(String[] args) {
        CargoPlane5 cp=new CargoPlane5();
        FighterPlane5 fp=new FighterPlane5();
        Airport airport=new Airport();
        airport.permit(cp);
        System.out.println("*************************************************");
        airport.permit(fp);
    }
}
