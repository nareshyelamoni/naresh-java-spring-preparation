package com.naresh.oops.inheritance.part1;

class Constructor{
    Constructor(){

        System.out.println("Constructor of parent class");
    }
}
class ConstructorChild extends Constructor{
    /*Constructor do not participate in inheritance , they do get executed when we created
      instance of child class because of super() call present in child class constructor
     */

}
public class InheritanceExample5 {
    public static void main(String[] args) {
        ConstructorChild cc=new ConstructorChild();
    }
}
