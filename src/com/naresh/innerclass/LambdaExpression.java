package com.naresh.innerclass;
interface Tv{
    void display();
    //Because lambda expressions require a functional interface with only one abstract method,
    // but here the interface has two abstract methods.
    //int power();
}
/*class Sony implements Tv{
    @Override
    public void display() {
        System.out.println("display videos");
    }
}*/
public class LambdaExpression {
    public static void main(String[] args){
        //Tv tv=new Sony();
        //tv.display();
        /*Tv tv=new Tv() {
            @Override
            public void display() {
                System.out.println("videos playing");
            }
        };
        tv.display();*/
        //Lambda expression is a short way to implement functional interfaces.
        // It reduces boilerplate code by removing the need for anonymous inner classes.
        Tv tv=()-> System.out.println("sony tv display");
        tv.display();
    }
}
