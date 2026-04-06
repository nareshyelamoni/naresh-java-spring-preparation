package com.naresh.innerclass;
class Solar{
    static public void generatePower(){
        System.out.println("generated from solar");
    }
    public void powerStorage(){
        System.out.println("store in Capacitors");
    }
    public void powerSupplyStop(){
        System.out.println("supply stop");
    }
    class SolarPowerPanel extends Solar{
        //powerStorage();--> we cannot use directly
        /*Non-static inner classes cannot have static methods.
        Only static nested classes can have static members.
        static void noOfPanels(){
            System.out.println("required at least one");
        }*/
        void powerCapacity(){
            powerStorage();
            System.out.println("10000 units");
            generatePower();
        }
        /*an inner class can extend its outer class. In that case,
        it behaves like a normal subclass and supports method overriding and runtime polymorphism."
         */
        public void powerSupplyStop(){
            System.out.println("supply non stop");
        }

    }
}
public class InnerClassWithoutStatic {
    public static void main(String[] args) {
        Solar.generatePower();
        Solar solar=new Solar();
        solar.powerStorage();
        solar.powerSupplyStop();
        Solar.SolarPowerPanel obj= solar.new SolarPowerPanel();
        obj.powerCapacity();
        obj.powerSupplyStop();
        //Solar.SolarPowerPanel.noOfPanels();
    }
}
