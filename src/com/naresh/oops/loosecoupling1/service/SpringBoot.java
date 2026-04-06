package com.naresh.oops.loosecoupling1.service;

public class SpringBoot implements PurchaseCourse{
    @Override
    public Boolean course(Double amount) {
        System.out.println("SpringBoot Course purchased Successfully with an amount: "+amount);
        return true;
    }
}
