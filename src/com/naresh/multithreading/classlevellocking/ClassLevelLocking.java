package com.naresh.multithreading.classlevellocking;

public class ClassLevelLocking {
    public static void main(String[] args) {
        HSBCBank1 bank1=new HSBCBank1();

        ATM1 atm1 =new ATM1();

        GooglePay1 googlePay1 =new GooglePay1();

        Phonepe1 phonepe1 =new Phonepe1();

        atm1.start();
        googlePay1.start();
        phonepe1.start();

    }
}
