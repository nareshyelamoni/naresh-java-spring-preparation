package com.naresh.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LaunchForEach {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(42);
        list.add(50);
        list.add(6);
        System.out.println(list);
        for(Integer i:list){
            Integer res=i*2;
            System.out.println(res);
        }
        System.out.println(list);

        Consumer<Integer> con=new Consumer<>() {

            @Override
            public void accept(Integer o) {
                System.out.println(o);
            }

        };
        list.forEach(con);
        //use lambda
        list.forEach((n)-> System.out.println(n));

    }
}
