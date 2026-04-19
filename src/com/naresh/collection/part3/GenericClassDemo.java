package com.naresh.collection.part3;
class GenericType<T>{
    private T id;
    public GenericType(T id){
        this.id=id;
    }
    public void disp(){
        System.out.println(id);
    }
}
public class GenericClassDemo {
    public static void main(String[] args) {
        GenericType<Integer> g=new GenericType<>(new Integer(10));
        g.disp();
        GenericType<String> g1=new GenericType<>(new String("Naresh"));
        g1.disp();
    }
}
