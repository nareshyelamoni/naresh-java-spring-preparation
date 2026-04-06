package com.naresh.oops.loosecoupling1.main;

import com.naresh.oops.loosecoupling1.service.PurchaseCourse;

public class NareshTech {
    private PurchaseCourse purchaseCourse;

    public NareshTech(PurchaseCourse purchaseCourse) {
        this.purchaseCourse = purchaseCourse;
    }

    public void setPurchaseCourse(PurchaseCourse purchaseCourse) {
        this.purchaseCourse = purchaseCourse;
    }
    public Boolean CoursePurchase(Double amount){
        return purchaseCourse.course(amount);
    }
}
