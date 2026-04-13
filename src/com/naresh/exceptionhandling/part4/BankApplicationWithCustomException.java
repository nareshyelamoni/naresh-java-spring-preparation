package com.naresh.exceptionhandling.part4;

import java.util.Scanner;
//it works for single time only
class InvalidCredentialException extends Exception{
 public InvalidCredentialException(String msg){
     super(msg);
 }
}
class IcIcIAtm{
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
    public void verify() throws InvalidCredentialException {
        if(accNo==accountNo && accPw==accountPw){
            System.out.println("proceed with cash");
        }
        else{
            InvalidCredentialException invalidCredentialException=new InvalidCredentialException("invalid credentials");
            System.out.println(invalidCredentialException.getMessage());
            throw invalidCredentialException;

        }
    }
}
class IcIcIBank{
    public void initiate(){
        IcIcIAtm iciciAtm=new IcIcIAtm();
        try {
            iciciAtm.input();
            iciciAtm.verify();
        }catch (InvalidCredentialException e){
            System.out.println("Try Again");
            try {
                iciciAtm.input();
                iciciAtm.verify();
            }catch (InvalidCredentialException e1){
                System.out.println("Try Again");
                try {
                    iciciAtm.input();
                    iciciAtm.verify();
                }catch (InvalidCredentialException e2){
                    System.out.println("No more attempts , account freezes temporarily");
                }
            }
        }

    }
}
public class BankApplicationWithCustomException {
    public static void main(String[] args) {
        IcIcIBank icIcIBank=new IcIcIBank();
        icIcIBank.initiate();
    }
}
