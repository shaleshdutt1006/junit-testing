package com.uservalidator;

import java.util.regex.Pattern;

public class UserValidator {

    /*
    Validating Password with at least one upper case and eight minimum characters
     */
    private static final String Password_Pattern = "(?=.*[A-Z])" + ".{8,}";

    public boolean vaildatePassword(String Password) {
        Pattern pattern = Pattern.compile(Password_Pattern);
        return pattern.matcher(Password).matches();

    }

}
