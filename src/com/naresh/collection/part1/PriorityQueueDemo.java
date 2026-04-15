package com.naresh.collection.part1;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        /*
        * PriorityQueue does NOT maintain sorting order in printing
        * Only head element is guaranteed (smallest)
        * Uses Heap internally
        * It is a Complete Binary Tree
        * Left to right fills
        * Best for:Scheduling,Dijkstra algorithm,Task priority systems*/
        PriorityQueue<Object> pq=new PriorityQueue<>();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
        System.out.println(pq);
        //not allowed
        /*PriorityQueue pq1=new PriorityQueue();
        pq1.add(100);
        pq1.add("ram");
        pq1.add(true);
        pq1.add(2.5);
        pq1.add(75);
        pq1.add('a');
        pq1.add(175);
        System.out.println(pq1);*/
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.contains(10));
        System.out.println(pq.size());
        pq.add(25);
        System.out.println(pq);
        pq.add(100);
        System.out.println(pq);

    }
}
