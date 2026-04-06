package com.naresh.oops.loosecoupling.main;

import com.naresh.oops.loosecoupling.service.DeliveryProduct;

public class Amazon {
    private DeliveryProduct service;
    public Amazon(DeliveryProduct service){
        this.service=service;
    }
    public void  getService(DeliveryProduct service) {
        this.service=service;
    }

    public Boolean deliveredTheProduct(Double amount){
        return service.productDelivered(amount);
    }
}
