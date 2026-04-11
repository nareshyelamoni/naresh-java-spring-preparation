package com.naresh.exceptionhandling.part2;

import java.util.Scanner;

public class GenericExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Connection established");
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the numerator:");
            int num = scan.nextInt();
            System.out.println("Enter the denominator:");
            int den = scan.nextInt();
            int res = num / den;
            System.out.println("Result is :" + res);
            System.out.println("Enter the size of array");
            int size = scan.nextInt();
            int[] ar = new int[size];
            System.out.println("enter the element");
            int ele = scan.nextInt();
            System.out.println("kindly enter the position");
            int pos = scan.nextInt();
            ar[pos] = ele;
            System.out.println(ar[pos] + " is successfully added in array");
        } catch (Exception e) {
            System.out.println("some problem");
        }
        System.out.println("Terminate the connection");

    }
}
