package com.naresh.collection.part3;

public class GenericDemo1 {
    public static void main(String[] args) {
        Object obj=new String("java");
        String str;
        //str=obj;-->incompatible types
        str=(String) obj;
        System.out.println(str);
        System.out.println(obj);
    }
}
