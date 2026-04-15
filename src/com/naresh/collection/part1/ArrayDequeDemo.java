package com.naresh.collection.part1;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        /*
        * No index-based methods
        * No null allowed
        *Faster than LinkedList
        * Implements Deque (double-ended queue)
        *Best for:Stack,Queue*/
        ArrayDeque<Object> ad = new ArrayDeque<>();

        ad.add(25);
        ad.add(25);
        ad.add(true);
        ad.addFirst("Ram");
        ad.addLast("hanuman");

        System.out.println(ad);

        System.out.println(ad.pop());   // removeFirst
        System.out.println(ad);

        System.out.println(ad.peek());  // just read

        System.out.println(ad.remove()); // remove first
        System.out.println(ad);

        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());

        System.out.println(ad.size());

        ArrayDeque<Object> ad1 = new ArrayDeque<>();
        ad1.add(25);
        ad1.add(25);
        ad1.add(true);
        ad1.addFirst("Ram");
        ad1.addLast("hanuman");

        ad.addAll(ad1);

        System.out.println(ad);

    }
}
