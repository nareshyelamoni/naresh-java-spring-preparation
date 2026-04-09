package com.naresh.string.part1;

public class DifferBetweenPlusAndConcat {
    public static void main(String[] args) {
        String str="Naresh";
        //it created in SCP
        String str1="Naresh"+" is Java Developer";
        // concat() creates a new String object in heap
        // result is not stored in SCP unless intern() is used
        String str2=str.concat(" is Java Developer");
        System.out.println(str1==str2);

        //By using concatenation we can add two strings only
        String name="Shiva";
        // concat() result is created in heap and it will execute in runtime
        String frd=name.concat("is my frd");
        // itr will create in pool
        /*
        * "+" Operator
        *it evaluate in Compile-time(if constants)
        * Result → it will store in SCP*/
        String bond="shiva "+"is "+" my "+"friend";
        //Left → Right evaluation
        String s="Spring Boot"+2500+4500+3900;
        System.out.println(s);
        String c=45+55+"Ram";
        System.out.println(c);
    }
}
