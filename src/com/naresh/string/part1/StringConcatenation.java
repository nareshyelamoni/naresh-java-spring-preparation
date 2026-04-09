package com.naresh.string.part1;

public class StringConcatenation {
    public static void main(String[] args) {
        String MyFavoriteTeacher="Sathayanarayana sir";
        //actually print the reference but it override toString method
        System.out.println(MyFavoriteTeacher);
        String str="Madhu sir and Asha mam";
        //it don't have the reference
        str.concat("are  my favorite faculties");
        System.out.println(str);//Madhu sir and Asha mam
        //for suppose
        str=str.concat("are  my favorite faculties");
        System.out.println(str);
    }
}
