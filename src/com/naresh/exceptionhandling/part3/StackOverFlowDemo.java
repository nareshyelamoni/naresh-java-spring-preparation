package com.naresh.exceptionhandling.part3;
class Apple{
    public void greenApples(){
        redApple();
    }
    public void redApple(){
        greenApples();
    }
}
public class StackOverFlowDemo {
    public static void main(String[] args) {
        Apple apple=new Apple();
        apple.greenApples();
    }
}
