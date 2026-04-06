package com.naresh.oops.inheritance.part3;
class Plane{

}class FighterPlane extends Plane{

}
class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
    void sleep(){
        System.out.println("Animal is sleeping");
    }
    public void hunting(){
        System.out.println("Animal Hunting in the forest");
    }
    public Plane flying(){
        System.out.println("Plane is flying");
        Plane p=new Plane();
        return p;
    }
}
class Tiger extends Animal{
    //you can't reduce the visibility of the method
    /*protected void eat(){
        -->you can't reduce the visibility of the method
    }*/
    public void eat(){
        System.out.println("Tiger is eating");
    }
    //Increasing the visibility of override method is allowed
    public void sleep(){
        System.out.println("Tiger is Sleeping");
    }
    //The primitive return type cannot be changed
    /*public int hunting(){
        System.out.println("Animal roaming the forest");
        return 0;
        --->The primitive return type cannot be changed
    }*/
    //co-varient return type are such return where there is Is-A relationship
    public FighterPlane flying(){
        System.out.println("Plane is flying");
        FighterPlane fp=new FighterPlane();
        return fp;
    }

}
public class OverrideMethodRules {
    public static void main(String[] args) {
        Tiger t=new Tiger();
    }
}
