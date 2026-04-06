package com.naresh.oops.inheritance.part2;
class Alpha3{
    int a,b;
    public Alpha3() {
        a=10;
        b=20;
        System.out.println("Alpha with Zero parameter Constructor");
    }

    public Alpha3(int a, int b) {
        this();
        this.a = a;
        this.b = b;
        System.out.println("Alpha with parameter Constructor");
    }
}
class Beta3 extends Alpha3{
    int x,y;
    public Beta3(){
        this(2,2);
        x=1;
        y=2;
        System.out.println("Beta with Zero parameter Constructor");
    }

    public Beta3(int x, int y) {
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
public class ThisAndSuperMethodWorkInInheritance4 {
    public static void main(String[] args) {
        Beta3 b3=new Beta3();
        b3.disp();
    }
}
