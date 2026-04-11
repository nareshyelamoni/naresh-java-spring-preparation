package com.naresh.exceptionhandling.part2;

import java.util.Scanner;

class Beta8{
    public void calc()throws ArithmeticException{
        System.out.println("Alpha10 Connection established");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int num = scan.nextInt();
        System.out.println("Enter the denominator:");
        int den = scan.nextInt();
        int res = num / den;
        System.out.println("Result is :" + res);
        System.out.println("Alpha10 Terminate the connection");
    }
}
public class ThrowsKeywordDemo {
    public static void main(String[] args) {
        System.out.println("main is connected");
        try{
            Beta8 beta8=new Beta8();
            beta8.calc();
        } catch (ArithmeticException e) {
            System.out.println("Enter the denominator is non zero");
        }
    }
}
