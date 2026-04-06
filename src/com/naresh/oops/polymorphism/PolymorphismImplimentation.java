package com.naresh.oops.polymorphism;
/*“Polymorphism means one method can perform different actions based on the object.
In Java, it is achieved using method overloading (compile-time) and method overriding (runtime).”*/
class Aeroplane4{
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
class CargoPlane4 extends Aeroplane4{
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
class FighterPlane4 extends Aeroplane4{
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
public class PolymorphismImplimentation {
    public static void main(String[] args) {
        CargoPlane3 cp=new CargoPlane3();
        FighterPlane3 fp=new FighterPlane3();
        Aeroplane3 aeroplane;
        aeroplane =cp;
        aeroplane.landing();
        aeroplane.takeOff();
        aeroplane.fly();
        System.out.println("**********************************");
        aeroplane =fp;
        aeroplane.landing();
        aeroplane.takeOff();
        aeroplane.fly();
    }
}
