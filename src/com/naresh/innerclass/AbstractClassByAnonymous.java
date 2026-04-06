package com.naresh.innerclass;
abstract class Apollo{
    abstract public void patientDetails();
    public void patientInfo(){
        System.out.println("patient in hyd");
    }
}
/*class HydApollo extends Apollo{
    @Override
    public void patientDetails() {
        System.out.println("patient details");
    }
}*/
public class AbstractClassByAnonymous {
    public static void main(String[] args) {
        //we cannot create object directly.
        // But we can create it using an anonymous inner class by providing implementation for abstract methods.
        Apollo apollo=new Apollo() {
            @Override
            public void patientDetails() {
                System.out.println("patient details");
            }
        };
        apollo.patientDetails();
        apollo.patientInfo();
    }
}
