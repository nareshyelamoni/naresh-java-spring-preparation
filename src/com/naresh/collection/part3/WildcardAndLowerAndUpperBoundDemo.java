package com.naresh.collection.part3;

import java.util.ArrayList;

class Human{
    int age;
    public void disp(){
        System.out.println("human is best creature on the earth");
    }
}
class OuStudent extends Human{

}
class JpEmployee{

}
public class WildcardAndLowerAndUpperBoundDemo {
    public static void main(String[] args) {
        Object obj=new Object();
        String str=new String("hockey");
        obj=str;
        System.out.println(obj);
        Human h=new Human();
        OuStudent os=new OuStudent();
        JpEmployee je=new JpEmployee();
        h=os;
        //h=je;-->errror
        System.out.println(h);
        ArrayList<Human> hal=new ArrayList<>();
        ArrayList<OuStudent> oal=new ArrayList<>();
        //hal=oal; not allowed
        //Objects follow inheritance, Generics don’t — Wildcards fix this.
        ArrayList<?> hal1=new ArrayList<>();
        ArrayList<OuStudent> oal1=new ArrayList<>();
        ArrayList<JpEmployee> jp=new ArrayList<>();
        hal1=jp;
        hal1=oal1;
        //This list can hold Human OR any subclass of Human
        ArrayList<? extends Human> hal2=new ArrayList<>();//Upper bound
        ArrayList<OuStudent> oal2=new ArrayList<>();
        ArrayList<JpEmployee> jp2=new ArrayList<>();
        //hal2=jp; not allowed only children's of Human is allowed
        hal2=oal2;
        ArrayList<? super Human> hal3=new ArrayList<>();//Lower bound
        ArrayList<OuStudent> oal3=new ArrayList<>();
        ArrayList<JpEmployee> jp3=new ArrayList<>();
        //hal3=oal3;-->error
        //hal3=jp3;-->error
        //suppose
        ArrayList<Object> alo=new ArrayList<>();
        hal3=alo;

    }
}
