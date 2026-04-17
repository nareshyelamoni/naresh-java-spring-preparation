package com.naresh.collection.part2;

import java.util.HashSet;

public class HashsetDemo {
    public static void main(String[] args) {
        /*
        * Important Points
        * No duplicates
        * No insertion order
        * Fast operations (O(1) average)
        * Uses Hashing*/
        HashSet hs=new HashSet();
        hs.add(100);
        hs.add(200);
        hs.add(300);
        hs.add(400);
        hs.add(500);
        System.out.println(hs);
    }
}
