package com.naresh.arrays;

import java.util.Arrays;

class Academy{
    String name;
    int id;
    String batch;
}
public class ObjectAndArraysClassMethodOverArray {
    public static void main(String[] args) {
        Academy academy=new Academy();
        System.out.println(academy);
        System.out.println(academy.getClass().getName());
        //Tshaped tshaped=new Tshaped; not there
        System.out.println("***************************************");
        //array is also object it has the reference
        /*
        * object class method can't apply to array
        * by the util package Arrays class static method apply to array to perform operations
        */
        int[] arr=new int[5];
        System.out.println(arr);
        System.out.println(arr.getClass().getName());
        int[][] ar=new int[2][2];
        System.out.println(ar);
        System.out.println(ar.getClass().getName());
        int[] array={41,74,1,47,85,12,56};
        for(int a:array){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("After sort method");
        Arrays.sort(array);
        for (int a:array){
            System.out.print(a+" ");
        }
    }
}
