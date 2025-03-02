package com.java.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) {

        //Validate Mobile Number
        System.out.println(validateMobileNumber("903-201-2673"));

        //Validate Name
        System.out.println(validateName("Guru Prasad"));
    }

    public static boolean validateMobileNumber(String mobileNumber){
        Pattern regex=Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        Matcher mobileMatcher=regex.matcher(mobileNumber);
        return mobileMatcher.matches();
    }

    public static boolean validateName(String name){
        Pattern regex=Pattern.compile("([A-Za-z]+\\s?)+");
        Matcher nameMatcher=regex.matcher(name.trim());
        return nameMatcher.matches();
    }

}
