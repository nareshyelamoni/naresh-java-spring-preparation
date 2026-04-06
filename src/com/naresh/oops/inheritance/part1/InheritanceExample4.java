package com.naresh.oops.inheritance.part1;

//cyclic inheritance involving Parent
/*class Parent extends Child
{
    void disp(){
        System.out.println("Iam parent");
    }
}*/
/*class Child extends Parent
{
    void disp1(){
        System.out.println("Iam Child");
    }
}*/
class Parent extends Object {
    
}
public class InheritanceExample4
{
    public static void main(String[] args)
    {
        //Child ch=new Child();
        System.out.println("cyclic inheritance involving Parent");
        //ch.disp1();
    }
}

