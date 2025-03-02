package com.java.regularexpression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*To Understand Regular Expression.
Write Java program  that will Validate email id based on the below requirements
     1.Email id Must start with a string and can contain numbers.
     2.Email id can have "-" or "." as a valid character .No other Symbol like #,%,&,( etc are allowed .
     3.Must contain @ Symbol before the domain name.
     4.The Domain name could be combination of alphabets and numbers.*/
public class RegularExpression1 {


    private static final String EMAIL_REGEX="^[a-zA-Z0-9][a-zA-Z0-9.-]*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$";

    public static void main(String[] args) {
        System.out.println(isValidateEmail("guru8080.gp@gmail.com"));  //Valid E-Mail Id
        System.out.println(isValidateEmail("guru8080#gp@gmail.com"));  // In Valid E-Mail Id

    }

    public static boolean isValidateEmail(String email){
        Pattern regex=Pattern.compile(EMAIL_REGEX);
        Matcher emailMather=regex.matcher(email.trim());
        return emailMather.matches();
    }

}
