package com.naresh.oops.loosecoupling.service;
public class BlueCart implements DeliveryProduct {
    @Override
    public Boolean productDelivered(Double amount) {
        System.out.println("product delivered by Bluecart successfully with amount of :"+amount);
        return true;
    }
}
