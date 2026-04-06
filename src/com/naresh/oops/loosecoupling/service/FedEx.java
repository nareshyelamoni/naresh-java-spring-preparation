package com.naresh.oops.loosecoupling.service;

public class FedEx  implements DeliveryProduct {
    @Override
    public Boolean productDelivered(Double amount) {
        System.out.println("product delivered by FedEx successfully with amount of :"+amount);
        return true;
    }
}
