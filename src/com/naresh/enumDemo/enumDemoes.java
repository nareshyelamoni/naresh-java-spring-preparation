package com.naresh.enumDemo;
//Enum in Java is a special data type used to define a collection of fixed constants.
// It improves readability, type safety, and maintainability of code.
enum Week{
    MON, TUE, WED, THU,FIR, SAT, SUN;
}
public class enumDemoes {
    public static void main(String[] args) {
        Week week=Week.MON;
        System.out.println(week);
        System.out.println(week.ordinal());//it provide index
    }
}
