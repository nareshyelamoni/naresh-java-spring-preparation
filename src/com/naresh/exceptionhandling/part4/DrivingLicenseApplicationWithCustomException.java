package com.naresh.exceptionhandling.part4;

import java.util.Scanner;
class UnderAgeException extends Exception{
    public UnderAgeException(String msg){
        super(msg);
    }
}
class OverAgeException extends Exception{
    public OverAgeException(String msg){
        super(msg);
    }
}
class Applicant{
    String name;
    int age;
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name");
        name=scanner.next();
        System.out.println("Enter your age");
        age=scanner.nextInt();
    }
    public void verify() throws UnderAgeException, OverAgeException {
        if(age>=18 && age<=60){
            System.out.println("proceed with your application");
        } else if (age<18) {
            UnderAgeException underAgeException=new UnderAgeException("You dont have the age limit");
            System.out.println(underAgeException.getMessage());
            throw underAgeException;
        }else{
            OverAgeException overAgeException=new OverAgeException("Your age is above the limit");
            System.out.println(overAgeException.getMessage());
            throw overAgeException;
        }
    }
}
class RTO{
    public void initiate(){
        Applicant applicant=new Applicant();
        try{
            applicant.input();
            applicant.verify();
        } catch (UnderAgeException | OverAgeException e) {
            System.out.println("try again");
            try{
                applicant.input();
                applicant.verify();
            } catch (UnderAgeException | OverAgeException e1) {
                System.out.println("try again");
                try{
                    applicant.input();
                    applicant.verify();
                } catch (UnderAgeException | OverAgeException e3) {
                    System.out.println("your application declined");
                }
            }
        }
    }
}
public class DrivingLicenseApplicationWithCustomException {
    public static void main(String[] args) {
        RTO rto=new RTO();
        rto.initiate();
    }
}
