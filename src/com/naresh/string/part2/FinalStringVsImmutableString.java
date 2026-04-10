package com.naresh.string.part2;

public class FinalStringVsImmutableString {
    public static void main(String[] args) {
        //final keyword prevents reassignment of reference,
        // whereas String immutability prevents modification of object content.
        String s1="Naresh";
        s1=s1+" tech";
        System.out.println(s1);
        //final String
        final String s2="Mahesh";
        //s2=s2+" tech";-->Cannot assign a value to final variable
        System.out.println(s2);
        final String s3="Prasad";
        String s4=s3+" tech";
        System.out.println(s4);
    }
}
