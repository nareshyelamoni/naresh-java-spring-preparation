package com.naresh.oops.variables;
class Employee{
    //default values for instance variables
    //scope of the instance variables can be anywhere with in the instance methods
    //memory allocated in heap area
    String name;
    int age;
    int id;
    void studying(){
        System.out.println(name+" is Studying");
    }
    void playingWithId(){
        System.out.println(name+" is playing with "+id);
    }
}
public class ObjectCreation {
    public static void main(String[] args) {
        //object creation with new keyword
        Employee employee=new Employee();
        employee.playingWithId();
        employee.studying();
    }
}
