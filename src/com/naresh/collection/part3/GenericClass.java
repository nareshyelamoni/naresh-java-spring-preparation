package com.naresh.collection.part3;
class Gen<T>{
    private T ref;
    public Gen(T ref){
        this.ref=ref;
    }
    public T getRef() {
        return ref;
    }
    public void disp(){
        System.out.println(ref.getClass().getName());
    }
}
public class GenericClass {
    public static void main(String[] args) {
        Gen<Integer> g=new Gen<>(10);
        System.out.println(g.getRef());
        g.disp();
        Gen<String> gs=new Gen<>(new String("Ashok"));
        System.out.println(gs.getRef());
        gs.disp();
    }
}
