package com.naresh.oops.loosecoupling1.main;

import com.naresh.oops.loosecoupling1.service.SpringBoot;
import com.naresh.oops.loosecoupling1.service.SpringWithGenAi;

public class LaunchNareshTech {
    public static void main(String[] args) {
        NareshTech nareshTech=new NareshTech(new SpringBoot());
        nareshTech.setPurchaseCourse(new SpringWithGenAi());
        Boolean status=nareshTech.CoursePurchase(2499.00);
        if(status){
            System.out.println("Payment Success");
        }else {
            System.out.println("Payment Failed");
        }
    }
}
