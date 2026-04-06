package com.naresh.oops.loosecoupling1.service;

public class SpringWithGenAi implements PurchaseCourse{
    @Override
    public Boolean course(Double amount) {
        System.out.println("Spring With GenAI Course purchased Successfully with an amount: "+amount);
        return true;
    }
}
