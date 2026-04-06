package com.naresh.oops.interfaces;
interface Monkey{
    void behaviour();
}
interface Human extends Monkey{
    void sixthSense();
    void behaviour();
}
class Person implements Human,Monkey{
    public void behaviour() {
        System.out.println("proper behaviour");
    }
    public void sixthSense() {
        System.out.println("Human as sixthSense");
    }
}
public class InterfaceExtendsAnotherInterface {
    public static void main(String[] args) {
        Monkey monkey=new Person();
        monkey.behaviour();
        ((Person)monkey).sixthSense();
        System.out.println("*********************************************");
        Human human =new Person();
        human.behaviour();
        human.sixthSense();
        System.out.println("******************************************");
        Person person=new Person();
        person.behaviour();
        person.sixthSense();
    }
}
