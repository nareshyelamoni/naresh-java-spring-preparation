package com.naresh.oops.methodoverloading;
class MultiplicationCal{
    public int mul(int a, int b){
        return a*b;
    }
    /*'mul(int, int)' is already defined error
    public int mul(int a, int b){
        return a*b;
    }*/
    public double mul(double a, double b){
        return a*b;
    }
    public double mul(int  a, int  b, double c){
        return a*b*c;
    }
}
public class MethodOverLoadingDemo2 {
    public static void main(String[] args) {
        int a=1,b=2,c=3;
        double x=2.5,y=3.6,z=8.9;
        MultiplicationCal mCal=new MultiplicationCal();
        System.out.println(mCal.mul(a,b));
        /*
        * Method overloading supports type promotion
        * Java selects the best matching method
        * If exact match not found → automatic conversion happens
        * This is called widening (implicit casting)*/
        System.out.println(mCal.mul(a,b,c));
    }
}
