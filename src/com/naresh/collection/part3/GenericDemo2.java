package com.naresh.collection.part3;

public class GenericDemo2 {
    public static void main(String[] args) {
        Object obj[]=new Object[3];
        obj[0]="hyder sir";
        obj[1]=new String("kunal kushwa sir");
        obj[2]=44;
        for(Object o:obj){
            System.out.println(o);
        }
        for(Object o:obj){
            String str=(String)o;
            System.out.println(str);//ClassCastException for obj[2]=44;
        }
    }
}
