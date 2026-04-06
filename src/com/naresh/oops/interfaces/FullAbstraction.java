package com.naresh.oops.interfaces;
interface Calc{
    void add(int a, int b);
    void sub(int a, int b);
}
class MyCal1 implements Calc{
    public void add(int a, int b) {
        int res=a+b;
        System.out.println("res is "+res);
    }
    public void sub(int a, int b) {
        int res=a-b;
        System.out.println("res is "+res);
    }
}
class MyCal2 implements Calc{
    public void add(int a, int b) {
        System.out.println("res is "+(a+b));
    }
    public void sub(int a, int b) {
        int res=a-b;
        System.out.println("res is "+(a-b));
    }
}
class MyCal3 implements Calc{
    public void add(int a, int b) {
        if(a>0&& b>0){
            int res=a+b;
            System.out.println("res is "+res);
        }
        else{
            System.out.println("enter greater than 0");
        }
    }
    public void sub(int a, int b) {
        if(a>0&& b>0){
            int res=a-b;
            System.out.println("res is "+res);
        }
        else{
            System.out.println("enter greater than 0");
        }

    }
}
class Perform{
    public void performOperation(Calc c,int a, int b){
        c.add(a,b);
        c.sub(a,b);
    }
}
public class FullAbstraction {
    public static void main(String[] args) {
        MyCal1 myCal1=new MyCal1();
        MyCal2 myCal2=new MyCal2();
        MyCal3 myCal3=new MyCal3();
        Perform perform=new Perform();
        perform.performOperation(myCal1,44,4);
        perform.performOperation(myCal2,45,25);
        perform.performOperation(myCal3,55,85);
    }
}
