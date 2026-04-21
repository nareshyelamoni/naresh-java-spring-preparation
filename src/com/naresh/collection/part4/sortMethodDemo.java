package com.naresh.collection.part4;

import java.util.ArrayList;
import java.util.Collections;

public class sortMethodDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(25);
        al.add(45);
        al.add(85);
        al.add(89);
        al.add(1);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        ArrayList<String> al1=new ArrayList<>();
        al1.add("anu");
        al1.add("divya");
        al1.add("sowmya");
        al1.add("vishal");
        al1.add("ashok");
        System.out.println(al1);
        Collections.sort(al1);
        System.out.println(al1);
    }
}
