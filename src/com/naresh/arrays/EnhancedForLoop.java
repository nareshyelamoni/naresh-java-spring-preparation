package com.naresh.arrays;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] arr;
        //arr={1,2,5,8,9};--->Array initializer is not allowed here
        arr=new int[]{1,2,3,5,8,9,4};
        int [][] array={{1,4,5,8},{12,45,85,85},{7,4,6}};
        /*
        * we do not have the control over the array by enhanced for loop it will print continues
        */
        System.out.println("1D array");
        for(int a:arr){
            System.out.println(a);
        }
        System.out.println("2D array");
        for(int[] a:array){
            for(int ele:a){
                System.out.println(ele);
            }
        }
        int[] marks=new int[5];
        marks[0]=45;
        marks[1]=45;
        marks[2]=45;
        marks[3]=45;
        marks[4]=45;
        //marks[5]=45;--->Array index is out of bounds

    }
}
