package com.naresh.innerclass;
class Apple{
    public void color(){
        System.out.println("it is in red color");
    }
    public void sweet(){
        System.out.println("it is more sweet");
    }
}
/*Instead of creating a separate class-->
class ChangeAppleColor extends Apple{
    @Override
    public void color() {
        System.out.println("It is in green color");
    }
}*/
public class AnonymousInnerClass {
    public static void main(String[] args) {
        //Apple apple=new ChangeAppleColor();
        //apple.color();
        /*Create a child class of Apple without name and create object immediately.
        It is a class without a name that is declared and instantiated in a single expression.
        It is used for one-time use, mainly to override methods or implement interfaces.*/
        Apple apple=new Apple(){
            @Override
            public void color() {
                System.out.println("it is in green color");
            }
        };
        apple.color();
        apple.sweet();
    }
}
