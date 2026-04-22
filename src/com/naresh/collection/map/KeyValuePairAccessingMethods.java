package com.naresh.collection.map;


import java.util.*;

public class KeyValuePairAccessingMethods {
    public static void main(String[] args) {
        HashMap<Integer, String> list=new HashMap<>();
        list.put(1,"Java");
        list.put(2,"Spring");
        list.put(3,"Hibernate");
        list.put(4,"Microservice");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        Collection<String> val=list.values();
        Iterator itr=val.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        Set key=list.keySet();
        Iterator it=key.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Set lis=list.entrySet();
        Iterator itrr=lis.iterator();
        while (itrr.hasNext()){
            Map.Entry pair=(Map.Entry) itrr.next();
            System.out.println("key is "+pair.getKey()+" value is "+pair.getValue());
        }
    }
}
