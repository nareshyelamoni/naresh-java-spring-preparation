package com.naresh.oops.loosecoupling.main;

import com.naresh.oops.loosecoupling.service.BlueCart;
import com.naresh.oops.loosecoupling.service.FightFly;

public class AmazonApp {
    public static void main(String[] args) {
        Amazon amazon=new Amazon(new BlueCart());
        amazon.getService(new FightFly());
        Boolean status=amazon.deliveredTheProduct(2500.00);
        if(status)
            System.out.println("Delivery successfully");
        else
            System.out.println("Delivery Failed");
    }

}
