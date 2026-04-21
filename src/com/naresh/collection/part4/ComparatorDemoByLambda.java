package com.naresh.collection.part4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer2{
    int age;
    String name;
    double avg;

    public Cricketer2(int age, String name, double avg) {
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

public class ComparatorDemoByLambda {
    public static void main(String[] args){
        Cricketer2 c1=new Cricketer2(35,"virat",95.6);
        Cricketer2 c2=new Cricketer2(36,"Rohit",92.6);
        Cricketer2 c3=new Cricketer2(32,"Klrahual",90.6);
        ArrayList<Cricketer2> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);
        //Collections.sort(list);
        Comparator<Cricketer2> c=(Cricketer2 o1, Cricketer2 o2)->{
            if(o1.avg> o2.avg)
                return 1;
            else if(o1.avg< o2.avg)
                return -1;
            else
                return 0;
        };
        Collections.sort(list,c);
        System.out.println(list);

    }
}
