package com.naresh.collection.part3;
class MyArray<T>{
    //T obj[]=new T[];--->Java does NOT allow direct creation of generic arrays
    T obj[]=(T[])new Object[10];
    int length=0;
    public void append(T obj){
        this.obj[length++]=obj;
    }
    public void disp(){
        for(T x:obj){
            System.out.println(x);
        }
    }
}
public class GenericD3<T> {
    public static void main (String[] args){
        MyArray<String> gd3=new MyArray<>();
        gd3.append("kite");
        gd3.append("Ram");
        gd3.append("god");
        gd3.disp();
    }
}
