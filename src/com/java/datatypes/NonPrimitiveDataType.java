package com.java.datatypes;

public class NonPrimitiveDataType {
    public static void main(String[] args) {
        String str1="Guru";                           //String  literal
        String str2="Guru";
        String str3=new String("Guru");      // Using Constructor

        System.out.println(str1 == str2);  //true (checking reference)
        System.out.println(str1 == str3);  //false
        System.out.println(str1.equals(str3)); // true (checking content)

        //String Operation
        String a="Prasad";
        a=a.toUpperCase();
        System.out.println(a);
        System.out.println(a.substring(0,3)); // PRA 0 to 2 index it will print
    }
}
