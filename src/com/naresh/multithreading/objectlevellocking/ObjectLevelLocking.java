package com.naresh.multithreading.objectlevellocking;

public class ObjectLevelLocking {
    public static void main(String[] args) {
        HSBCBank bank1=new HSBCBank(4000);

        HSBCBank bank2=new HSBCBank(4000);
        ATM atm=new ATM(bank1);

        GooglePay googlePay=new GooglePay(bank2);

        Phonepe phonepe=new Phonepe(bank1);

        atm.start();
        googlePay.start();
        phonepe.start();

    }
}
