package com.naresh.oops.interfaces;
interface Naresh{
    void developer();
    default void programmer(){
        System.out.println("Naresh is dsa programmer");
    }
}
interface Vishal extends Naresh{
    default void programmer(){
        System.out.println("vishal  is a specialist programmer");
    }
}
class JavaDeveloper implements Naresh,Vishal{
    public void developer() {
        System.out.println("Both are developers");
    }
    public  void programmer(){
        System.out.println("Naresh and vishal are dsa programmer");
    }
}
public class DefaultMethodInInterface {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper=new JavaDeveloper();
        javaDeveloper.developer();
        javaDeveloper.programmer();//latest override method is calling
        System.out.println("*****************************");
        Naresh naresh=new JavaDeveloper();
        naresh.developer();
        naresh.programmer();//latest override method is calling
        System.out.println("*****************************");
        Vishal vishal=new JavaDeveloper();
        vishal.programmer();//latest override method is calling
        vishal.developer();
    }
}
