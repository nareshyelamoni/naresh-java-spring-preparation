package com.naresh.string.part2;

public class MutableStringDemo1 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("Naresh tech");
        //mutable (change possible without creating new object)
        sb1.append(1);
        sb1.append('c');
        sb1.append(4.5);
        sb1.append(true);
        sb1.append("ram");
        //char[] is specially handled and printed as characters,
        // whereas other arrays use Object's toString() method which prints reference value.
        char[] a={'v','g'};
        sb1.append(a);
        sb1.append(new int[]{1,2,4,5,6});
        System.out.println(sb1);
        StringBuilder sb2=new StringBuilder("Naresh tech");
        sb2.append(1);
        sb2.append('c');
        sb2.append(4.5);
        sb2.append(true);
        sb2.append("ram");
        char[] b={'v','g'};
        sb2.append(b);
        sb2.append(new int[]{1,2,4,5,6});
        System.out.println(sb1);
    }
}
