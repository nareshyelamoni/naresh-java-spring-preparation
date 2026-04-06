package com.naresh.oops.inheritance.part1;
class Launch{
    int age;
    void disp(){
        age=10;
        System.out.println("Launch age is "+age);
    }
}
class Launch1 extends Launch{

}
public class InheritanceExample1 {
    public static void main(String[] args) {
        //Launch l1=new Launch();
        //l1.disp();
        Launch1 l2=new Launch1();
        l2.disp();
    }
}
