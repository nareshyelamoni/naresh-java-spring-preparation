package com.naresh.collection.part4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer1{
    int age;
    String name;
    double avg;

    public Cricketer1(int age, String name, double avg) {
        this.age = age;
        this.name = name;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                '}';
    }
}

public class ComparatorDemoByInnerClass {
    public static void main(String[] args){
        Cricketer1 c1=new Cricketer1(35,"virat",95.6);
        Cricketer1 c2=new Cricketer1(36,"Rohit",92.6);
        Cricketer1 c3=new Cricketer1(32,"Klrahual",90.6);
        ArrayList<Cricketer1> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);
        //Collections.sort(list);
        Comparator<Cricketer1> c=new Comparator<Cricketer1>() {
            @Override
            public int compare(Cricketer1 o1, Cricketer1 o2) {
                if(o1.avg> o2.avg)
                    return 1;
                else if(o1.avg< o2.avg)
                    return -1;
                else
                    return 0;
            }
        };
        Collections.sort(list,c);
        System.out.println(list);

    }
}
