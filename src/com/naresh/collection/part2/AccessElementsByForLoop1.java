package com.naresh.collection.part2;

import java.util.ArrayList;

public class AccessElementsByForLoop1 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        //it follows order of insertion
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(25);
        al.add(45);System.out.println(al);
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        System.out.println("----------------");
        for(Object o:al){
            System.out.println((int)o);
        }
        //Infinite loop
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
            //al.add(44);
        }
    }
}
