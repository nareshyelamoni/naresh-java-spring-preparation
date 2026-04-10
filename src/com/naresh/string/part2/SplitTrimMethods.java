package com.naresh.string.part2;

public class SplitTrimMethods {
    public static void main(String[] args) {
        String teacher="Sathnarayana sir is my favorite Teacher";
        String[] words=teacher.split(" ");
        for(String word:words){
            System.out.println(word);
            char[] letters=word.toCharArray();
            for(char ele:letters){
                System.out.println(ele);
            }
        }
        String str="   Hyder abbas sir teach java perfectly and neatly      ";
        //removes basic spaces (ASCII)
        str=str.trim();
        System.out.println(str);
        String str1="   Hyder abbas sir teach java perfectly and neatly      ";
        //removes Unicode whitespace (modern method)
        System.out.println(str1.strip());
        System.out.println(str1.repeat(4));
    }
}
