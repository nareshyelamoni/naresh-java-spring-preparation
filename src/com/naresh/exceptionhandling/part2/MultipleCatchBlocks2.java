package com.naresh.exceptionhandling.part2;

import java.util.Scanner;

public class MultipleCatchBlocks2 {
    public static void main(String[] args) {
        System.out.println("Connection established");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter the numerator:");
            int num = scan.nextInt();
            System.out.println("Enter the denominator:");
            int den = scan.nextInt();
            int res = num / den;
            System.out.println("Result is :" + res);
        }catch (ArithmeticException e){
            System.out.println("number should be non zero");
        }
        try {
            System.out.println("Enter the size of array");
            int size = scan.nextInt();
            int[] ar = new int[size];
            System.out.println("enter the element");
            int ele = scan.nextInt();
            System.out.println("kindly enter the position");
            int pos = scan.nextInt();
            ar[pos] = ele;
            System.out.println(ar[pos] + " is successfully added in array");
        }catch (NegativeArraySizeException e){
            System.out.println("array size should be positive only");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("position is with in the limit");
        }catch (Exception e) {
            System.out.println("some problem");
        }
        System.out.println("Terminate the connection");

    }
}
