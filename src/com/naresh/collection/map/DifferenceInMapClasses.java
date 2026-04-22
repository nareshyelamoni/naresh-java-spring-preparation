package com.naresh.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class DifferenceInMapClasses {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        //not follow order of insertion
        hm.put(1,"java");
        hm.put(2,"spring");
        hm.put(4,"jdbc");
        hm.put(3,"Microservices");
        System.out.println(hm);

        // LinkedHashMap
        LinkedHashMap lhm=new LinkedHashMap<>();
        //order of insertion follow
        lhm.put(1,"java");
        lhm.put(2,"spring");
        lhm.put(4,"jdbc");
        lhm.put(3,"Microservices");
        //null value is allowed
        lhm.put(null,null);
        System.out.println(lhm);

        //Hashtable
        Hashtable ht=new Hashtable();
        ht.put(1,"java");
        ht.put(2,"spring");
        ht.put(4,"jdbc");
        ht.put(3,"Microservices");
        //will get NullPointerException
        //ht.put(null,null);
        System.out.println(ht);

        //TreeMap
        TreeMap tm=new TreeMap();
        tm.put(1,"java");
        tm.put(2,"spring");
        tm.put(4,"jdbc");
        tm.put(3,"Microservices");
        //we get NullPointerException
        //tm.put(null,null);
        System.out.println(tm);

    }
}
