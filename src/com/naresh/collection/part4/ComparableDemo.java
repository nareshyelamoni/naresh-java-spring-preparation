package com.naresh.collection.part4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer3 implements Comparable<Cricketer3>{
    int age;
    String name;
    double avg;

    public Cricketer3(int age, String name, double avg) {
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

    @Override
    public int compareTo(Cricketer3 o) {
        /*if(this.avg > o.avg){
            return 1;
        } else if (this.avg < o.avg) {
            return -1;
        }else {
            return 0;
        }*/
        return this.name.compareTo(o.name);
    }
}
public class ComparableDemo {
    public static void main(String[] args){
        Cricketer3 c1=new Cricketer3(35,"virat",95.6);
        Cricketer3 c2=new Cricketer3(36,"Rohit",92.6);
        Cricketer3 c3=new Cricketer3(32,"Klrahual",90.6);
        ArrayList<Cricketer3> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);
        //Collections.sort(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
