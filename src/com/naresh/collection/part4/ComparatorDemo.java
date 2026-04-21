package com.naresh.collection.part4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer{
    int age;
    String name;
    double avg;

    public Cricketer(int age, String name, double avg) {
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
class CDemo implements Comparator<Cricketer>{
    @Override
    public int compare(Cricketer o1, Cricketer o2) {
        if(o1.avg> o2.avg)
            return 1;
        else if(o1.avg< o2.avg)
            return -1;
        else
            return 0;
    }

}
public class ComparatorDemo {
    public static void main(String[] args){
        Cricketer c1=new Cricketer(35,"virat",95.6);
        Cricketer c2=new Cricketer(36,"Rohit",92.6);
        Cricketer c3=new Cricketer(32,"Klrahual",90.6);
        ArrayList<Cricketer> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);
        //Collections.sort(list);
        CDemo cDemo=new CDemo();
        Collections.sort(list,cDemo);
        System.out.println(list);

    }
}
