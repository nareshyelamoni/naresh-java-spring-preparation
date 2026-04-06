package com.naresh.oops.abstraction;
// we cannot make abstract class as final because final class cant participate in inheritance
/*final abstract class MisterTea{
    public MisterTea(){
        System.out.println("MisterTea Franchise");
    }
    // we cannot make abstract method as final because final methods are inherited
    // we cannot override it
    public final abstract  void customerDetails();
    public abstract void listOfItems();
}*/
abstract class MisterTea{
    public MisterTea(){
        System.out.println("MisterTea Franchise");
    }
    public abstract  void customerDetails();
    public abstract void listOfItems();
}
class MisterTeaHyd extends MisterTea{
    public void customerDetails(){
        System.out.println("customer details");
    }
    public void listOfItems(){
        System.out.println("menu contain list of items");
    }
}
public class ConstructorInAbstraction {
    public static void main(String[] args) {
        MisterTea misterTea=new MisterTeaHyd();
        misterTea.customerDetails();
        misterTea.listOfItems();
    }
}
