package com.naresh.oops.inheritance.part2;
class Alpha2{
    int a,b;
    public Alpha2() {
        a=10;
        b=20;
        System.out.println("Alpha with Zero parameter Constructor");
    }

    public Alpha2(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Alpha with parameter Constructor");
    }
}
class Beta2 extends Alpha2{
    int x,y;
    public Beta2(){
        this(2,2);
        x=1;
        y=2;
        System.out.println("Beta with Zero parameter Constructor");
    }

    public Beta2(int x, int y) {
        super(4,44);
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
public class ThisAndSuperMethodWorkInInheritance2 {
    public static void main(String[] args) {
        Beta2 b2=new Beta2();
        b2.disp();
    }
}
