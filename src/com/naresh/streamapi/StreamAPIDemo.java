package com.naresh.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(42);
        list.add(50);
        list.add(6);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        List<Integer>list2=new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(42);
        list2.add(50);
        list2.add(6);
        System.out.println(list2);
        Set<Integer> set=list2.stream().collect(Collectors.toSet());
        System.out.println(set);
    }
}
