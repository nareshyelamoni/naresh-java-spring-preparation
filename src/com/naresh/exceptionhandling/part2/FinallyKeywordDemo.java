package com.naresh.exceptionhandling.part2;

import java.util.Scanner;
class Alpha5{
    public void calc()throws ArithmeticException{
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
            throw e;
        }
        finally {
            scan.close();
            System.out.println("Alpha10 Terminate the connection");
        }

    }
}
public class FinallyKeywordDemo {
    public static void main(String[] args) {
        System.out.println("main is started");
        try{
            Alpha5 alpha5=new Alpha5();
            alpha5.calc();
        } catch (ArithmeticException e) {
            System.out.println("main catch block");
        }
        System.out.println("main is terminated");
    }
}
