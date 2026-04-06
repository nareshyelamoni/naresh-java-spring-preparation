package com.naresh.innerclass;
class WaterTank{
    static int taps=20;
    private int tanks=56;
    int pipeLines;
    {
        pipeLines=10;
    }
    void tankVolume(){
        System.out.println("volume of tank is 1000 liters");
    }
    /*Inner classes are used to logically group related classes together.
    They improve encapsulation by allowing access to outer class private members,
    and they are useful when a class is only needed by another class.
    They are commonly used in event handling, callbacks, and to make code more organized and readable."
     */
    static class GateValve{
        //"Static nested class can access only static members of outer class directly.
        // To access non-static members, we need to create outer class object."
        WaterTank tank=new WaterTank();
        void gateValueOpen(){
            System.out.println(taps+" are open");
            //Inner class can access private members
            System.out.println(tank.tanks);
            //Static class cannot access it directly
            System.out.println("water supply through "+tank.pipeLines+" pipelines");
            System.out.println("water is supply through main gateValve");
        }
    }

}
public class InnerClassWithStatic {
    public static void main(String[] args) {
        WaterTank waterTank=new WaterTank();
        waterTank.tankVolume();
        //we cannot access the inner class method through the outer class object
        //waterTank.gateValveOpen();
        WaterTank.GateValve wg= new WaterTank.GateValve();
        wg.gateValueOpen();
        //wg.tankVolume();--> not access

    }
}
