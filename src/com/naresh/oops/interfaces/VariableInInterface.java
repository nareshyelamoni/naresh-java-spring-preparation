package com.naresh.oops.interfaces;
interface Variable{
    void disp();
    float pi=3.14f;//by default it is static, public and final
}
interface Variable1{
    void disp();
}
class Launch implements Variable,Variable1{
    //common for both interfaces
    public void disp() {
        System.out.println("pi : "+pi);
    }
}
public class VariableInInterface {
    public static void main(String[] args) {
        Launch launch=new Launch();
        launch.disp();
        System.out.println(Variable.pi);
        Variable variable=new Launch();
        variable.disp();
        Variable1 variable1=new Launch();
        variable1.disp();
    }
}
