package com.naresh.oops.inheritance.part2;
class Alpha1{
    int a,b;
    public Alpha1() {
        a=10;
        b=20;
        System.out.println("Alpha with Zero parameter Constructor");
    }

    public Alpha1(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Alpha with parameter Constructor");
    }
}
class Beta1 extends Alpha1{
    int x,y;
    public Beta1(){
        //super()-->by default there in every class  constructor
        x=1;
        y=2;
        System.out.println("Beta with Zero parameter Constructor");
    }

    public Beta1(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Beta with parameter Constructor");
    }
    public void disp(){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
public class ConstructWorkInInheritance2 {
    public static void main(String[] args) {
        Beta1 b=new Beta1(2,2);
        b.disp();
    }
}
