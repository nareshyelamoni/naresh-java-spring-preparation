package com.naresh.oops.interfaces;
interface Calc1{
    void add(int a, int b);
    void sub(int a, int b);
}
interface Calc2{
    int mul(int a, int b);
    int div(int a, int b);
}
class MyCalc1 implements Calc1,Calc2{
    public void add(int a, int b) {
        int res=a+b;
        System.out.println("res is "+res);
    }
    public void sub(int a, int b) {
        int res=a-b;
        System.out.println("res is "+res);
    }
    public int div(int a, int b) {
        return a*b;
    }
    public int mul(int a, int b) {
        return a*b;
    }
}
class MyCalc2 implements Calc1,Calc2{
    public void add(int a, int b) {
        System.out.println("res is "+(a+b));
    }
    public void sub(int a, int b) {
        int res=a-b;
        System.out.println("res is "+(a-b));
    }
    public int mul(int a, int b) {
        int result=a*b;
        return result;
    }
    public int div(int a, int b) {
        int result=a/b;
        return result;
    }
}
class MyCalc3 implements Calc1{
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
    public int  mul(int a, int b) {
        if(a>0&& b>0){
            int res=a*b;
            return res;
        }
        else{
            return -1;
        }
    }
    public int  div(int a, int b) {
        if(a>0&& b>0){
            int res=a/b;
            return res;
        }
        else{
            return -1;
        }
    }
}
public class TwoInterfaces {
    public static void main(String[] args) {
        Calc1 calc1=new MyCalc1();
        System.out.println("we can access only parent interface method from parent reference");
        calc1.add(4,5);
        calc1.sub(7,4);
        System.out.println("from down casting we can access it ");
        System.out.println(((MyCalc1) calc1).mul(4,5));
        System.out.println(((MyCalc1) calc1).div(4,5));
        System.out.println("From Child class we access all override and special methods  ");
        MyCalc2 myCalc2=new MyCalc2();
        myCalc2.add(7,8);
        myCalc2.sub(5,6);
        System.out.println(myCalc2.mul(4,5));
        System.out.println(myCalc2.div(45,9));
    }
}
