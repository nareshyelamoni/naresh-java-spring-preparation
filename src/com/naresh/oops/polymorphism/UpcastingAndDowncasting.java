package com.naresh.oops.polymorphism;
class Aeroplane3{
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
class CargoPlane3 extends Aeroplane3{
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
class FighterPlane3 extends Aeroplane3{
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
public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        Aeroplane3 cp=new CargoPlane3();
        cp.takeOff();
        cp.fly();
        cp.landing();
        Aeroplane3 fp=new FighterPlane3();
        fp.takeOff();
        fp.fly();
        fp.landing();
    }
}
