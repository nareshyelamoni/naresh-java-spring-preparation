package com.naresh.collection.part2;

import java.util.Iterator;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        /*
        * Thread-safe version of ArrayList
        * No ConcurrentModificationException
        * Uses copy mechanism*/
        CopyOnWriteArrayList<Integer> al=new CopyOnWriteArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(25);
        al.add(45);
        System.out.println(al);
        Iterator itr=al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

            al.add(44);
        }
    }
}
