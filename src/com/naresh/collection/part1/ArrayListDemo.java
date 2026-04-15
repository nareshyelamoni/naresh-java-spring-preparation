package com.naresh.collection.part1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*
        * maintains insertion order
        * allows duplicates
        * allows heterogeneous data (if Object type)
        * NOT synchronized*/
        ArrayList al=new ArrayList();
        //it follows order of insertion
        al.add(10);
        al.add(true);
        al.add("Naresh");
        al.add(3.5);
        al.add(20);
        System.out.println(al);
        //we add element based on index
        al.add(1,"JaiSriram");
        //we can override by set()
        al.set(0,"krishna");
        System.out.println(al);
        al.addFirst(20);
        al.addLast(63);
        System.out.println(al);
        //get the element by index
        System.out.println(al.get(2));
        //get the size
        System.out.println(al.size());
        System.out.println(al.remove("krishna"));
        System.out.println(al.indexOf(20));
        System.out.println(al.contains("naresh"));
        System.out.println(al);
        ArrayList al2=new ArrayList();
        //it follows order of insertion
        al2.add(10);
        al2.add(true);
        al2.add("Naresh");
        al2.add(3.5);
        al2.add(20);
        al.addAll(al2);
        //it allows duplicates
        System.out.println(al);
        List al1=al.reversed();
        System.out.println(al1);
    }
}
