package com.naresh.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDimensionRegularArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of institutes: ");
        int noOfInstitutes = scan.nextInt();
        System.out.print("Enter the no of courses in school: ");
        int noOfCourses = scan.nextInt();
        System.out.println();
        System.out.print("Enter the no of Students in school: ");
        int noOfStudents = scan.nextInt();
        System.out.println();
        //Array declaration
        String[][][] arr = new String[noOfInstitutes][noOfCourses][noOfStudents];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("enter the"+i+"th institute "+j+"th course Student names");
                for(int k=0;k<arr[i][j].length;k++){
                    arr[i][j][k] = scan.next();
                }
            }
        }
        //printing of array
        System.out.println("element in array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("the"+i+"th institute "+j+"th course Student names");
                System.out.println();
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print(arr[i][j][k]);
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.println(Arrays.toString(arr[i][j]));
            }
        }

    }
}
