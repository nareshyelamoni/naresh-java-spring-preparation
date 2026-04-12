package com.naresh.exceptionhandling.part3;
class Cat2{
    // method with checked exception
    public void sleep()throws InterruptedException{
        System.out.println("cat1 is sleeping");
    }
}
class Cheetha2 extends Cat2{
    //method with unchecked exception
    public void sleep()throws ArithmeticException {
        System.out.println("cheetha1 is sleeping");
    }
}
class Jaugar2 extends Cat2{
    // method without exception
    public void sleep() {
        System.out.println("Jaugar is sleeping");
    }
}
class Leopard extends Cat2{
    /*method with partial exception-->compilation error
    public void sleep() throws Exception{
        System.out.println("Jaugar is sleeping");
    }*/
}
public class ExceptionInCaseMethodOverride3 {
    public static void main(String[] args) {
        Cheetha2 c=new Cheetha2();
        c.sleep();
    }

}
