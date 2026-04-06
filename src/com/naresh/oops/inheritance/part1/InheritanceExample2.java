package com.naresh.oops.inheritance.part1;

class Aeroplane{
    void fly(){
        System.out.println("Aeroplane is flying");
    }
    void landing(){
        System.out.println("Aeroplane is landing");
    }
}
class Cargoplane extends Aeroplane{

}
//multilevel inheritance
class PassengerPlane extends Cargoplane{

}
public class InheritanceExample2 {
    public static void main(String[] args) {
        PassengerPlane pp=new PassengerPlane();
        pp.landing();
        pp.fly();
    }
}
