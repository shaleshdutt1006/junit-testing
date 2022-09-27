package com.uservalidator;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String Last_Name_Pattern = "^[A-Z]{1,}[a-z]{3,}+\s+[A-Z]{1,}[a-z]{2,}$";

    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(Last_Name_Pattern);
        return pattern.matcher(lname).matches();
    }



}
