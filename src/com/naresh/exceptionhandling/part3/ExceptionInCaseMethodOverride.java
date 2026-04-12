package com.naresh.exceptionhandling.part3;
class Cat{
    //method without exception
    public void sleep(){
        System.out.println("cat is sleeping");
    }
}
class Cheetha extends Cat{
    //method with unchecked exception
    public void sleep()throws ArithmeticException {
        System.out.println("Cheetha is sleeping");
    }
}
class Jaugar extends Cat{
    /* method with checked exception-->compilation error
    public void sleep()throws InterruptedException{

    }*/
}
public class ExceptionInCaseMethodOverride {
    public static void main(String[] args) {
        Cat c=new Cheetha();
        c.sleep();
    }

}
