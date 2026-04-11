package com.naresh.exceptionhandling.part2;

import java.util.Scanner;

class Alpha10{
    public void calc(){
        System.out.println("Alpha10 Connection established");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int num=scan.nextInt();
        System.out.println("Enter the denominator:");
        int den=scan.nextInt();
        int res=num/den;
        System.out.println("Result is :"+res);
        System.out.println("Alpha10 Terminate the connection");
    }
}
class Beta10{
    public void dis(){
        System.out.println("Beta10 is connected");
        Alpha10 alpha10=new Alpha10();
        alpha10.calc();
        System.out.println("Beta10 is terminated");
    }
}
public class PropagationOfExceptionToMethodCall {
    public static void main(String[] args) {
        System.out.println("main is connected");
        Beta10 beta10=new Beta10();
        beta10.dis();
        System.out.println("main is terminated");
    }
}
