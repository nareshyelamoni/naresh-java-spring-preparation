package com.naresh.innerclass;
interface PrintName{
    void  printFriendName(String name);
}
public class LamdaExpressionWithSingleArgument {
    public static void main(String[] args) {
        PrintName printName=s->System.out.println("my friend is "+s);
        printName.printFriendName("Ashok");
    }
}
