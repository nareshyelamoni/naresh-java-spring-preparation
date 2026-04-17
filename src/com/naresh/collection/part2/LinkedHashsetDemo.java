package com.naresh.collection.part2;

import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        /*
        * No duplicates
        * Maintains order
        * Slightly slower than HashSet*/
        LinkedHashSet hs=new LinkedHashSet();
        hs.add(100);
        hs.add(200);
        hs.add(300);
        hs.add(400);
        hs.add(500);
        System.out.println(hs);
    }
}
