package com.naresh.collection.part3;

import java.util.ArrayList;

class CollegeBag{
    private String color;
    private String brand;
    private int capacity;
    public CollegeBag(String color,String brand,int capacity){
        this.color=color;
        this.brand=brand;
        this.capacity=capacity;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getCapacity() {
        return capacity;
    }
}
public class TypesafetyDemo1 {
    public static void main(String[] args) {
        ArrayList<CollegeBag> al=new ArrayList<>();
        //al.add("java");-->error
        al.add(new CollegeBag("Black","SkyBag",5));
        al.add(new CollegeBag("Red","SkyBag",2));
        al.add(new CollegeBag("Brown","SkyBag",6));
        for(CollegeBag o:al){
            System.out.println(o.getBrand());
            System.out.println(o.getCapacity());
            System.out.println(o.getColor());
        }
        //ArrayList<Object> a=new ArrayList<Integer>();-->not allowed
        //ArrayList<int> a=new ArrayList<>();-->Type argument cannot be of a primitive type
        ArrayList<Integer> a=new ArrayList<>();//it allowed
    }
}
