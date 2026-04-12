package com.naresh.exceptionhandling.part3;
class Cat1{
    //method with unchecked exception
    public void sleep()throws ArithmeticException{
        System.out.println("cat1 is sleeping");
    }
}
class Cheetha1 extends Cat1{
    public void sleep() {
        System.out.println("cheetha1 is sleeping");
    }
}
class Jaugar1 extends Cat1{
    /* method with checked exception-->compilation error
    public void sleep()throws InterruptedException{

    }*/
}
public class exceptionInCaseMethodOverride2 {
    public static void main(String[] args) {
        Cat1 c=new Cheetha1();
        c.sleep();
    }

}
