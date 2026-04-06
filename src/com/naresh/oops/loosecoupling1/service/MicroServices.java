package com.naresh.oops.loosecoupling1.service;

public class MicroServices implements PurchaseCourse{
    @Override
    public Boolean course(Double amount) {
        System.out.println("MicroServices Course purchased Successfully with an amount: "+amount);
        return true;
    }
}
