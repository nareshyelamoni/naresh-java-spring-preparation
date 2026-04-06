package com.naresh.oops.inheritance.part1;

class PrivateVariable{
    private String name;
    void disp(){
        name="Naresh";
        System.out.println("My name is"+name);
    }
}
class PrivateVariableNotAss extends PrivateVariable{
    void disp1(){
        //name has private access in PrivateVariable
        //name="Ashok";-->private data members can't inherited
        System.out.println("private variable not access");
    }

}
public class InheritanceExample3 {
    public static void main(String[] args) {
        PrivateVariableNotAss pvna=new PrivateVariableNotAss();
        pvna.disp1();
    }
}
