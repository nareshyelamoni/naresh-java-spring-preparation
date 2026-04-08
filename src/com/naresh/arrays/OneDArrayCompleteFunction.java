package com.naresh.arrays;

import java.util.Arrays;
import java.util.Scanner;
/*
* array store homogenous data
* array size is fixed, when we change it , it will create a new array
* the size of array allowed datatype is integer
* it also positive value only
* array demands continues memory allocation
* array support multiple dimensions
*/

public class OneDArrayCompleteFunction {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the sizeof Array: ");
        int size= scan.nextInt();
        System.out.println();
        //Array declaration
        int[] arr=new int[size];
        /* Array initialization
        arr[0]=20;
        arr[1]=50;
        arr[2]=10;
        arr[3]=80;
        */
        for(int i=0;i< arr.length;i++){
            System.out.print("enter the "+i+"th element: ");
            arr[i]= scan.nextInt();
        }
        //printing of array
        System.out.println("element in array:");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("print of array with toString method");
        System.out.println(Arrays.toString(arr));

    }
}
