package com.company;
import java.util.regex.Pattern;
public class UserValidator {
    public static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    public static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    public static final String EMAIL_PATTERN = "^abc[.a-z]+@bl[.]co[.a-z]+";

    public boolean validateFirstName(String fname){
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }
    public boolean validateLastName(String lname){
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }
    public boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
}