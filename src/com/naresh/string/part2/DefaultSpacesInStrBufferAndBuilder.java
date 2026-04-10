package com.naresh.string.part2;

public class DefaultSpacesInStrBufferAndBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1.capacity());

        StringBuffer sb2=new StringBuffer();
        System.out.println(sb2.capacity());
        sb1.append("Sachin");
        sb1.append("tendulkar");
        sb1.append("India");
        /*
        new capacity = (old capacity * 2) + 2
        */
        System.out.println(sb1.capacity());
        sb2.append("Sachin");
        sb2.append("tendulkar");
        sb2.append("India");
        /*
        new capacity = (old capacity * 2) + 2
        */
        System.out.println(sb2.capacity());

        StringBuffer sb3=new StringBuffer();
        sb3.append("Sachin");
        System.out.println(sb3.capacity());//16
        //trimToSize() → removes unused memory
        sb3.trimToSize();
        System.out.println(sb3.capacity());//6
        sb3.append("kohli");//6*2+2
        System.out.println(sb3.capacity());//14
        //Initial string → capacity = 16 + length
        StringBuilder sb=new StringBuilder("Dohni");
        System.out.println(sb.capacity());//16+5=21
    }
}
