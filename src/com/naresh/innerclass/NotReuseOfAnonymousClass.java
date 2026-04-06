package com.naresh.innerclass;
class Human{
    public void behaviour(){
        System.out.println("he is very lazy");
    }
    public void knowledge(){
        System.out.println("not sharp");
    }
}
public class NotReuseOfAnonymousClass {
    static void main(String[] args) {
        Human human=new Human(){
            @Override
            public void behaviour() {
                System.out.println("he is active now");
            }
            @Override
            public void knowledge(){
                System.out.println("he is very sharp");
            }
            public void nonAlcoholic(){
                System.out.println("he is non alcoholic");
            }
        };
        human.behaviour();
        human.knowledge();
        //In anonymous inner class, you cannot access new methods using parent reference.
        //human.nonAlcoholic();-->error -->cannot find symbol
        /*Normally no, because we use parent reference.
        But if we directly create and use the anonymous object without reference,
        we can call those methods.

        new Human(){
            @Override
            public void behaviour() {
                System.out.println("he is active now");
            }
            @Override
            public void knowledge(){
                System.out.println("he is very sharp");
            }
            public void nonAlcoholic(){
                System.out.println("he is non alcoholic");
            }
        }.nonAlcoholic();*/
    }
}
