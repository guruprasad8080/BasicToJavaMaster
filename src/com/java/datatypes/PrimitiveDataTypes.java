package com.java.datatypes;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        System.out.println("Guru");
        System.out.println("---Byte Range---");

        System.out.println("Minimum Value: "+ Byte.MIN_VALUE);
        System.out.println("Maximum Value: "+ Byte.MAX_VALUE);

        System.out.println("---Integer Range---");

        System.out.println("Minimum Value: "+ Integer.MIN_VALUE);
        System.out.println("Maximum Value: "+ Integer.MAX_VALUE);

        System.out.println("---Double Range---");

        System.out.println("Minimum Value: "+ Double.MIN_VALUE);
        System.out.println("Maximum Value: "+ Double.MAX_VALUE);

        System.out.println("---Float Range---");

        System.out.println("Minimum Value: "+ Float.MIN_VALUE);
        System.out.println("Maximum Value: "+ Float.MAX_VALUE);

        System.out.println("---Boolean Range---");

        System.out.println("True Value: "+ Boolean.TRUE);
        System.out.println("False Value: "+ Boolean.FALSE);

        System.out.println("---Character Range---");

        System.out.println("Minimum Value: "+ (int) Character.MIN_VALUE);
        System.out.println("Maximum Value: "+ (int) Character.MAX_VALUE);

        // Common ASCII example (0-127 range)

        System.out.println((char) 10084); // print heart emoji
    }
}