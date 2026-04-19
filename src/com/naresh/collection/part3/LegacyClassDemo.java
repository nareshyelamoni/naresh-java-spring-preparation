package com.naresh.collection.part3;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class LegacyClassDemo {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.addElement(10);
        v.add(15);
        v.add(25);
        v.add(33);
        v.add(25);
        Iterator itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Enumeration e=v.elements();

        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
