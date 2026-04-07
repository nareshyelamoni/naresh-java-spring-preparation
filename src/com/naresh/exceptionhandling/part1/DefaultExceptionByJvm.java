package com.naresh.exceptionhandling.part1;

import java.util.Scanner;

public class DefaultExceptionByJvm {
    public static void main(String[] args) {
        System.out.println("Connection established");
        Scanner scan=new Scanner(System.in);
        System.out.println("Kindly enter the numerator for division");
        int num= scan.nextInt();
        System.out.println("Kindly enter the denominator for division");
        int den= scan.nextInt();
        /* we enter num=25, den=0;
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at com.naresh.exceptionhandling.part1.DefaultExceptionByJvm.main(DefaultExceptionByJvm.java:13)
        it is default exception given by jvm
        it is abnormal termination
        */
        int res=num/den;
        System.out.println("Result is "+res);
        System.out.println("Connection terminated");

    }
}
