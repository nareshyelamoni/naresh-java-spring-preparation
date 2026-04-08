package com.naresh.arrays;

import java.util.Scanner;

class StudentDetails{
    int id;
    String name;
    String course;
    public StudentDetails(int id, String name,String course){
        this.id=id;
        this.name=name;
        this.course=course;
    }
}
public class ObjectArray {
    public static void main(String[] args) {
        System.out.println("Enter the of students");
        Scanner scan=new Scanner(System.in);
        int noOfStudents=scan.nextInt();
        StudentDetails[] sd=new StudentDetails[noOfStudents];
        /*
        sd[0]=new StudentDetails();
        sd[0].id=1;
        sd[0].name="naresh";
        as[0].course="java";
        */
        for(int i=0;i< sd.length;i++){
            System.out.println("enter the id of student");
            int id= scan.nextInt();
            System.out.println("enter the name of student");
            String name= scan.next();
            System.out.println("enter the course of student");
            String course= scan.next();
            sd[i]=new StudentDetails(id,name,course);
        }
        for (int i=0;i<sd.length;i++){
            System.out.println((i+1)+"th student details");
            System.out.println(sd[i].id);
            System.out.println(sd[i].name);
            System.out.println(sd[i].course);
        }
    }
}
