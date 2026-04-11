package com.naresh.exceptionhandling.part2;

import java.util.Scanner;

class Alpha9{
    public void calc(){
        System.out.println("Alpha10 Connection established");
        Scanner scan=new Scanner(System.in);
        try {
            System.out.println("Enter the numerator:");
            int num = scan.nextInt();
            System.out.println("Enter the denominator:");
            int den = scan.nextInt();
            int res = num / den;
            System.out.println("Result is :" + res);
        } catch (ArithmeticException e) {
            System.out.println("enter the non zero value");
            calc();
        }
        System.out.println("Alpha10 Terminate the connection");
    }
}
public class NoPropagationToMethodCaller {
    public static void main(String[] args) {
        System.out.println("main is connected");
        Alpha9 alpha9=new Alpha9();
        alpha9.calc();
        System.out.println("main is terminated");
    }
}
