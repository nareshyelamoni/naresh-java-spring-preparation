package com.naresh.exceptionhandling.part2;

import java.util.Scanner;
class Alpha6{
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
            //throw e;
        }
        finally {
            scan.close();
            System.out.println("Alpha10 Terminate the connection");
        }

    }
}
public class RethrowExceptionByThrowKW {
    public static void main(String[] args) {
        System.out.println("main is started");
        try{
            Alpha6 alpha6=new Alpha6();
            alpha6.calc();
        } catch (ArithmeticException e) {
            System.out.println("main catch block");
        }
        System.out.println("main is terminated");
    }
}
