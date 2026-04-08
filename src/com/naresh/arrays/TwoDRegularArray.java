package com.naresh.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDRegularArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of class in school: ");
        int noOfClasses = scan.nextInt();
        System.out.println();
        System.out.print("Enter the no of Students in school: ");
        int noOfStudents = scan.nextInt();
        System.out.println();
        //Array declaration
        String[][] arr = new String[noOfClasses][noOfStudents];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the " + i + "th class Students: ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.next();
            }
        }
        //printing of array
        System.out.println("element in array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("print the " + i + "th class Students: ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
