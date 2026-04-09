package com.naresh.string.part1;

public class StringMethods {
    public static void main(String[] args) {
        String str="RajaRamMohanRoy";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.substring(4,12));
        System.out.println(str.charAt(2));
        System.out.println(str.contains("Roy"));
        System.out.println(str.startsWith("Ram"));
        System.out.println(str.endsWith("roy"));
        char[] c=str.toCharArray();
        for (char ele:c){
            System.out.println(ele);
        }
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
    }
}
