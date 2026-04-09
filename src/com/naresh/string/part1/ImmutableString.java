package com.naresh.string.part1;

public class ImmutableString {
    public static void main(String[] args) {
        String str1="Naresh";
        String str2="Naresh";
        /*Both are referring to same object
        * String Constant Pool does not store duplicate string objects*/
        System.out.println(str1==str2);//true
        /*
        * new String() creates separate objects
        * So memory is different → == is false
        * But content is same → .equals() is true
        */
        String st1=new String("Rbvrrit");
        String st2=new String("Rbvrrit");
        System.out.println(st1==st2);//false
        System.out.println(st1.equals(st2));//true
        /*
         * "Java" already SCP lo undi
         *new String() → only heap lo new object create
         *Total objects = 1 (heap only)
         */
        String course1="Java";
        String course2=new String("Java");
        System.out.println(course1==course2);
        System.out.println(course1.equals(course2));
        /*First time "Naresh" using
        JVM creates:
        "Naresh" in SCP
        "Naresh" in Heap
        Total objects = 2
        */
        String name = new String("Naresh");
        //The variable 'name' refers only to the heap object.
        //No variable directly refers to the "Naresh" string in the String Constant Pool.
        //intern() changes the reference from the heap object to the String Constant Pool object.
        name = name.intern();
        System.out.println(name == "Naresh");//true
        //java is case sensitive
        String school="vnhs";
        String school1="Vnhs";
        System.out.println(school==school1);
        System.out.println(school.equals(school1));
        System.out.println(school.equalsIgnoreCase(school1));

    }
}
