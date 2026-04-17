package com.naresh.collection.part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class AccessElementsByIterator {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        //it follows order of insertion
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(25);
        al.add(45);
        System.out.println(al);
        Iterator itr=al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            //ConcurrentModificationException
            //al.add(44);
        }
        ListIterator lst= al.listIterator(al.size());
        while (lst.hasPrevious()){
            System.out.println(lst.previous());
        }
    }
}
