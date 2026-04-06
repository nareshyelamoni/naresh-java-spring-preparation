package com.naresh.oops.inheritance.part2;
class Parent {
    int i=10;
    void disp(){
        System.out.println("Display of Parent Method");
    }
}
class Child extends Parent{
    int i=100;
    void alpha(){
        System.out.println("Alpha of Child Method");
        System.out.println(i);
        System.out.println(super.i);
        disp();
        super.disp();
    }
    void disp() {
        System.out.println("Display of Child Method");
    }
}
public class ThisAndSuperKeywordWorkInInheritance5 {
    public static void main(String[] args) {
        new Child().alpha();
    }
}
