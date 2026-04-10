package com.naresh.string.part2;

public class EqualsMethod {
    public static void main(String[] args) {
        /*The String class overrides the equals() method
            It compares the content (value) of the strings, not the reference*/
        String str1=new String("Naresh");
        String str2=new String("Naresh");
        System.out.println(str1.equals(str2));
        /*The StringBuffer class does NOT override the equals() method
          So it uses the default equals() from the Object class
          This compares the reference (memory address), not the content*/
        StringBuffer sb1=new StringBuffer("Naresh");
        StringBuffer sb2=new StringBuffer("Naresh");
        System.out.println(sb1.equals(sb2));
    }
}
