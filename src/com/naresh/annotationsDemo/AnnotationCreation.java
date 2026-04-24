package com.naresh.annotationsDemo;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface Cricketer{
    String country() default "India";
    int age() default 25;
}

@Cricketer(country = "Austria",age = 30)
class ViratKohli{
    private int innings;
    public ViratKohli(){
        super();
    }
    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }
}

public class AnnotationCreation {
    public static void main(String[] args) {
        ViratKohli vk=new ViratKohli();
        vk.setInnings(358);
        System.out.println(vk.getInnings());
        System.out.println("**********************");
        //Class<? extends ViratKohli> c =vk.getClass();
        Cricketer an=vk.getClass().getAnnotation(Cricketer.class);
        System.out.println(an.age());
        System.out.println(an.country());
    }
}
