package com.java.datatypes;

public class WideningNarrowingConversion {

    public static void main(String[] args) {
        System.out.println("Widening Conversion Example:");
        byte byteValue=10;
        short shortValue=byteValue;
        int intValue=shortValue;
        long longValue=intValue;
        float floatValue=longValue;
        double doubleValue=floatValue;
        System.out.println("int: "+intValue);
        System.out.println("long: "+longValue);
        System.out.println("float: "+floatValue);
        System.out.println("double: "+doubleValue);

        System.out.println("Narrowing Conversion Example:");
        double doubleValue2=123.456;
        float floatValue2=(float) doubleValue2;
        long longValue2=(long) floatValue2;
        int intValue2=(int) longValue2;

        System.out.println("double: "+doubleValue2);
        System.out.println("float: "+floatValue2);
        System.out.println("long: "+longValue2);
        System.out.println("int: "+intValue2);
    }
}
