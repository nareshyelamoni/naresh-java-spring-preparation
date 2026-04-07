package com.naresh.exceptionhandling.part1;

import java.util.Scanner;

public class ExceptionByTryAndCatch {
    public static void main(String[] args) {
        System.out.println("Connection established");
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Kindly enter the numerator for division");
            int num = scan.nextInt();
            System.out.println("Kindly enter the denominator for division");
            int den = scan.nextInt();
            int res = num / den;
            System.out.println("Result is " + res);
        }catch (Exception e){
            System.out.println("please enter the denominator is non-zero value");
        }
        System.out.println("Connection terminated");
    }
}
