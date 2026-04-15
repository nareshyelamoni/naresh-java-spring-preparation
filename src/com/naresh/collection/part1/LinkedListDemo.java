package com.naresh.collection.part1;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        //order of insertion
        //LinkedList is best for frequent modifications, but slow for accessing elements
        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add("ravi");
        ll.add(false);
        ll.add(3.2);
        ll.add('a');
        System.out.println(ll);
        //insert at index
        ll.add(2,25);
        System.out.println(ll);
        //add first and last to linkedlist
        ll.addFirst("jai");
        ll.addLast("ashok");
        //get methods
        System.out.println(ll.get(3));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        //update
        ll.set(2,"ram");
        System.out.println(ll);
        //contain
        System.out.println(ll.contains("ram"));
        //size
        System.out.println(ll.size());
        //remove
        //Object remove = ll.remove();
        System.out.println(ll.remove((Object) 25));
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        LinkedList ll1=new LinkedList();
        ll1.add(10);
        ll1.add("ravi");
        ll1.add(false);
        ll1.add(3.2);
        ll1.add('a');
        ll.addAll(ll1);
        System.out.println(ll);
        System.out.println(ll1.reversed());
        //peek it give first element but it cant remove
        System.out.println(ll1.peek());
        //it will remove first one give to you
        System.out.println(ll1.poll());
        System.out.println(ll1.peekFirst());
        System.out.println(ll1.pop());
        System.out.println(ll1);

    }
}
