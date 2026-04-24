package com.naresh.enumDemo;
/*
* In Java, enum constants are created when the enum class is loaded.
* Since all constants are predefined objects, the constructor is called once for each constant,
* regardless of how many are used later in the program.*/
enum Months{
    JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;
    enum Weeks{
        MON,TUES,WED,THU,FRI,SAT,SUN;
    }
    Months(){
        System.out.println("constructor called..........");
    }
    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
public class enumDemo1 {
    public static void main(String[] args) {
        Months[] monarry=Months.values();
        for(Months m:monarry){
            System.out.println(m.ordinal()+"------>"+m);
        }

        //System.out.println(Months.Weeks.SUN);
        //Months one=Months.JAN;
        //one.setNum(1);
        //or
        Months.JAN.setNum(1);
        System.out.println(Months.JAN.getNum());
        System.out.println(Months.FEB.getNum());


    }
}
