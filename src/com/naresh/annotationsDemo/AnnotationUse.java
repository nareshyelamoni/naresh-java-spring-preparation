package com.naresh.annotationsDemo;
class Vehicle{
    public void running(){
        System.out.println("Vehicle running with four wheels");
    }
}
class Bus extends Vehicle{
    @Override
    public void running(){
        System.out.println("Bus running with six wheels");
    }
}
public class AnnotationUse {
    public static void main(String[] args) {
        Bus bus=new Bus();
        bus.running();
    }
}
