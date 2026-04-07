package com.naresh.oops.variables;
class Calculator{
    int num1;
    int num2;
    void add(){
        num1=10;
        num2=20;
        /* local variable scope is within method
        memory is allocated in method area
        memory is deallocated when the stackFrame of that method is deallocated after compilation
        there is no default values for local variables
        */
        int res;
        res=num1+num2;
        System.out.println("sum of two numbers:"+res);
    }
    void display(){
        //System.out.println(res);cannot find symbol
        System.out.println(num2);
    }
}
public class LocalVariables {
    public static void main(String[] args) {
        //object creation with new keyword
        Calculator calculator=new Calculator();
        calculator.add();
        System.out.println(calculator.num1);
        System.out.println(calculator.num2);
        //System.out.println(calculator.res);
    }

}
