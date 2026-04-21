package com.naresh.timeapi;
import java.util.*;
public class DateDemo {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//it counts form 1 jan 1970
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365.25);
        Date d=new Date();
        System.out.println(d);
        Date d1=new Date(System.currentTimeMillis());
        System.out.println(d1);
        d1.setYear(126);//it calculates year from 1900
        System.out.println(d1);
        System.out.println(d1.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getHours());
        Date d3=new Date("02/27/1998");
        System.out.println(d3);
    }
}
