package com.naresh.oops.methodoverloading;
class MultiplicationCal1{
    public double mult(int a, int b,double c)
    {
        System.out.println("2 int and 1 double");
        return a*b*c;
    }
    public double mult(double a, double b, int c)
    {
        System.out.println("2 double and 1 int");
        return a*b*c;
    }
}
public class MethodOverLoadingDemo3 {
    public static void main(String[] args) {
        int a=1,b=2,c=3;
        double x=2.5,y=3.6,z=8.9;
        MultiplicationCal1 mCal1=new MultiplicationCal1();
        //System.out.println(mCal1.mult(a,b,c));-->Ambiguous method call. Both
        //System.out.println(mCal1.mult(a,x,y));-->Cannot resolve method 'mult(int, double, double)'
        System.out.println(mCal1.mult(x,y,a));
    }
}
