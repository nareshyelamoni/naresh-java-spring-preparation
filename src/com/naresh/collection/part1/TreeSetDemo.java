package com.naresh.collection.part1;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        /*
        * TreeSet = Sorted + No duplicates
        * Uses Red-Black Tree
        * All operations → O(log n)
        * No null, no heterogeneous*/
        TreeSet ts=new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);
        //ts.addFirst(200);
        //ts.addLast(36);
        System.out.println(ts.remove(10));
        System.out.println(ts.contains(75));
        System.out.println(ts.first());
        System.out.println(ts.ceiling(125));
        System.out.println(ts.floor(100));
        System.out.println(ts.getFirst());
        System.out.println(ts.getLast());
        System.out.println(ts);
        System.out.println(ts.size());
    }
}
