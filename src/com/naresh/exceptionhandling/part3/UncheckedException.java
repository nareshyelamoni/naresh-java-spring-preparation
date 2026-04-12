package com.naresh.exceptionhandling.part3;

import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numerator");
        int num= scan.nextInt();
        System.out.println("Enter the denominator");
        int den=scan.nextInt();
        //unchecked exception
        System.out.println(num/den);
    }
}
