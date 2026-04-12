package com.naresh.exceptionhandling.part3;
class Bus{
    public int wheels(){
        try{
            System.out.println("Bus has wheels");
            return 4;
        }finally {
            System.out.println("Bus has more than 4 wheels");
            return 6;
        }
    }

}
public class TryDominatesReturn {
    public static void main(String[] args) {
        Bus bus=new Bus();
        System.out.println(bus.wheels());
    }
}
