package com.naresh.string.part2;

public class CompareToMethodDemo {
    public static void main(String[] args) {
        //compareTo() compares strings lexicographically
        // and returns 0, negative, or positive based on Unicode difference.
        String s1="NARESH";
        String s2="NARESH";
        System.out.println(s1.compareTo(s2));
        String s3="Mahesh";
        String s4="Mahi";
        System.out.println(s3.compareTo(s4));
        String s5="jaysriram";
        String s6="JaySriram";
        System.out.println(s5.compareTo(s6));
    }
}
