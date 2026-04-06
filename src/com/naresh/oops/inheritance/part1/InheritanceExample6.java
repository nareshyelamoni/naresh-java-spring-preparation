package com.naresh.oops.inheritance.part1;

class Aeroplane1{
    void fly(){
        System.out.println("Aeroplane is flying");
    }
    //inherited method
    void landing(){
        System.out.println("Aeroplane is landing");
    }
}
class PassengerPlane1 extends Aeroplane1{
    //override method
    void fly() {
        System.out.println("PassengerPlane is flying");
    }
    //specialized method
    void takeOff(){
        System.out.println("plane is takeoff");
    }
}
public class InheritanceExample6{
    public static void main(String[] args) {
        Aeroplane1 pp=new PassengerPlane1();//upcasting
        pp.fly();
        pp.landing();
        //pp.takeOff();-->not work
        //down casting
        //for specialized methods
        ((PassengerPlane1) pp).takeOff();
    }
}
