package com.naresh.collection.part3;

import java.util.ArrayList;
import java.util.Locale;

public class TypeSafetyDemo {
    public static void main(String[] args) {
        int arr[]=new int[3];
        arr[0]=44;
        arr[1]=17;
        //arr[2]="java"; array is static type it provide typesafety
        arr[2]=15;
        String str[]=new String[3];
        str[0]="java";
        str[1]="Tech";
        //str[2]= 447; get error
        //it take string type of data
        str[2]="jay";
        //No type safety
        ArrayList al=new ArrayList();
        al.add("naresh");
        al.add("MAHESH");
        al.add(44);
        //converting all string to lower case
        String s1=(String) al.get(0);
        s1=s1.toLowerCase();
        System.out.println(s1);
        String s2=(String) al.get(1);
        s2=s2.toLowerCase();
        System.out.println(s2);
        //ClassCastException
        /*String s3=(String) al.get(2);
        s3=s3.toLowerCase();
        System.out.println(s3);*/
        //with type safety
        ArrayList<String> s=new ArrayList<>();
        s.add("hanuman");
        //s.add(44);compiler error it provide typesafety by generics
        s.add("Ram");
        s.add("sita");
        System.out.println(s);
    }
}
