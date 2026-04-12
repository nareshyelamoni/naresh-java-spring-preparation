package com.naresh.exceptionhandling.part3;

import java.util.Scanner;

public class NestedTryCatchWithFinally {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("outer try block");
            System.out.println("Enter the numerator");
            int num= scan.nextInt();
            System.out.println("Enter the denominator");
            int den=scan.nextInt();
            System.out.println(num/den);
            try{
                System.out.println("inner try block");
                System.out.println("enter the size of array");
                int size= scan.nextInt();
                int[] ar=new int[size];
                System.out.println("enter the element");
                int ele= scan.nextInt();
                System.out.println("enter the poition");
                int pos= scan.nextInt();
                ar[pos]=ele;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("inner catch block");
            }
            finally {
                System.out.println("inner finally block Statement");
            }
            System.out.println("inner statement");
        } catch (Exception e) {
            System.out.println("Outer catch of Exception");
        }
        finally {
            System.out.println("Outer finally block Statement");
        }
        System.out.println("Complete outer statement");
    }
}
