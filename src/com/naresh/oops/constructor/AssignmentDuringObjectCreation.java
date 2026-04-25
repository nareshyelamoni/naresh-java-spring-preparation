package com.naresh.oops.constructor;
class Rectangle{
    private double l;
    private double b;
    public Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    public double area(){
        return l*b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
}
public class AssignmentDuringObjectCreation {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(45.3,89);
        System.out.println(r.area());
    }
}
