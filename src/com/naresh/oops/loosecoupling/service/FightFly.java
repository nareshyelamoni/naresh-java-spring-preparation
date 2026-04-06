package com.naresh.oops.loosecoupling.service;

public class FightFly implements DeliveryProduct{
    @Override
    public Boolean productDelivered(Double amount) {
        System.out.println("product delivered by FightFly successfully with amount of :"+amount);
        return true;
    }
}
