package com.naresh.oops.inheritance.part3;
/*final class Plane3{
    //Cannot inherit from final class
}*/
class Plane3{
    final public void display(){
        System.out.println("Plane has a number");
    }
}
class CargoPlane3 extends Plane3{
    //final method do participate in inheritance . However we cannot override it.
    /*public void display(){
        System.out.println("Plane has a number");
    }*/
    final int a=10;
    public void demo(){
        //a=15;we get error , we cannot override
        System.out.println("a: "+a);
    }
}
public class FinalKeywordInInheritance {
    public static void main(String[] args) {
        CargoPlane3 cp3=new CargoPlane3();
        cp3.display();
    }
}
