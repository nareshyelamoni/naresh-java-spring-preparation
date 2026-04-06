package com.naresh.innerclass;
interface PerformAdd{
    int add(int x, int y);
}
public class LambdaExpressionWithArguments {
    public static void main(String[] args) {
        /*PerformAdd performAdd=new PerformAdd() {
            @Override
            public int add(int x, int y) {
                return x+y;
            }
        };
        performAdd.add(1,2);*/
        PerformAdd performAdd=(x,y)-> x+y;
        int res=performAdd.add(4,5);
        System.out.println(res);
    }
}
