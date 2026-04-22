package com.naresh.collection.map;

import java.util.*;

class Passport{
    private String fullName;
    private int age;
    private String county;

    public Passport(String fullName, int age, String county) {
        this.fullName = fullName;
        this.age = age;
        this.county = county;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", county='" + county + '\'' +
                '}';
    }
}
public class PassportApplication {
    public static void main(String[] args) {
        System.out.println("Passport Application");
        Passport p1=new Passport("Naresh",25,"India");
        Passport p2=new Passport("Mahesh",25,"India");
        Passport p3=new Passport("Ashok",25,"India");
        Passport p4=new Passport("Prasad",24,"India");
        Passport p5=new Passport("Praneetha",23,"India");
        Passport p6=new Passport("Beesanna",25,"India");
        Integer id1=Integer.valueOf(101);
        Integer id2=Integer.valueOf(201);
        Integer id3=Integer.valueOf(301);
        Integer id4=Integer.valueOf(401);
        Integer id5=Integer.valueOf(501);
        Integer id6=Integer.valueOf(601);
        HashMap<Integer,Passport> list=new HashMap<>();
        list.put(id1,p1);
        list.put(id2,p2);
        list.put(id3,p3);
        list.put(id4,p4);
        list.put(id5,p5);
        list.put(id6,p6);
        //System.out.println(list);
        Scanner scan=new Scanner(System.in);
        boolean flag=false;
        System.out.println("please enter your id:");
        Integer num=(Integer)scan.nextInt();
        Set dbms=list.entrySet();
        Iterator itr=dbms.iterator();
        while (itr.hasNext()){
            Map.Entry pair=(Map.Entry) itr.next();
            if(pair.getKey().equals(num)){
                System.out.println("your details below");
                System.out.println(pair.getValue());
                flag=true;
            }
        }
        if (flag==false){
            System.out.println("unable to fetch your details");
        }

    }
}
