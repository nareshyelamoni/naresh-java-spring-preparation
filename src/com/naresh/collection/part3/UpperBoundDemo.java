package com.naresh.collection.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Domestic{
    public void dis(){
        System.out.println("these animals friendly to human");
    }
}
class Cat extends Domestic{

}
public class UpperBoundDemo {
    public static void main(String[] args) {
        ArrayList<Cat> alc=new ArrayList<>();
        alc.add(new Cat());
        alc.add(new Cat());
        alc.add(new Cat());
        alc.add(new Cat());
        invoke(alc);
        List<Integer> l=new ArrayList<>();
        List<Integer> ll=new LinkedList<>();
        List<Integer> ll2= Arrays.asList(10,20,33,45,7);
        Iterable<Integer> aa=display();
    }
    /* we get incompatible error
    public static void invoke(List<Domestic> list){
        for(Domestic o:list){
            System.out.println(o);
        }
    }*/
    public static void invoke(List<? extends Domestic> list){
        for(Domestic o:list){
            System.out.println(o);
        }
    }
    public static Iterable<Integer> display(){
        return new ArrayList<Integer>();
    }
}
