package com.uservalidator;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String First_Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(First_Name_Pattern);
        return pattern.matcher(fname).matches();
    }


}
