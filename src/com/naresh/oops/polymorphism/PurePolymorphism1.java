package com.naresh.oops.polymorphism;
class Bird{
    public void eat(){
        System.out.println("Bird is eating grains");
    }
    public void fly(){
        System.out.println("Bird is flying");
    }
}
class Pigeon extends Bird{
    public void eat(){
        System.out.println("Pigeon is eating grains");
    }
    public void fly(){
        System.out.println("Pigeon is flying");
    }
}
class Peacock extends Bird{
    public void eat(){
        System.out.println("Peacock is eating grains");
    }
    public void fly(){
        System.out.println("Peacock is flying");
    }
}
class Sky{
    public void permit(Bird bird){
        bird.eat();
        bird.fly();
    }
}
public class PurePolymorphism1 {
    public static void main(String[] args) {
        Pigeon p=new Pigeon();
        Peacock pc=new Peacock();
        Sky s=new Sky();
        s.permit(p);
        System.out.println("############################");
        s.permit(pc);
    }
}
