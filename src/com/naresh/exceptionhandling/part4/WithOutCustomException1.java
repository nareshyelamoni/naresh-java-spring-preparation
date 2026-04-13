package com.naresh.exceptionhandling.part4;

import java.util.Scanner;
//it works for single time only
class Atm{
    private int accNo=4545;
    private int accPw=1234;
    int accountNo;
    int accountPw;
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Account number");
        accountNo=scanner.nextInt();
        System.out.println("Enter your password");
        accountPw=scanner.nextInt();
    }
    public void verify(){
        if(accNo==accountNo && accPw==accountPw){
            System.out.println("proceed with cash");
        }
        else{
            System.out.println("invalid credentials");
        }
    }
}
class Bank{
    public void initiate(){
        Atm atm=new Atm();
        atm.input();
        atm.verify();
    }
}
public class WithOutCustomException1 {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.initiate();
    }
}
