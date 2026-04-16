package com.naresh.oops.methodoverloading;
class AdditionCal{
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b,int c){
        return a+b+c;
    }
    public double sum(double a, double b){
        return a+b;
    }
    public double sum(double a, double b, double c){
        return a+b+c;
    }
}
public class MethodOverLoadingDemo1 {
    public static void main(String[] args) {
        int a=1,b=2,c=3;
        double x=2.5,y=3.6,z=8.9;
        AdditionCal cal=new AdditionCal();
        System.out.println(cal.sum(a,b));
        System.out.println(cal.sum(a,b,c));
        System.out.println(cal.sum(x,y,z));
        System.out.println(cal.sum(x,y));
    }
}
