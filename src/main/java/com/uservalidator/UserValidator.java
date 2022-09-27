package com.uservalidator;

import java.util.regex.Pattern;

public class UserValidator {

    /**
     * Setting password which has at least 8 character one uppercase letter and one numeric number and
     * at least one special character and no whitespace allowed
     *
     * @param args
     */
    private static final String Password_Pattern = "(?=.*[A-Z])" + "(?=.*[0-9])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$)" + ".{8,}";

    public boolean vaildatePassword(String Password) {
        Pattern pattern = Pattern.compile(Password_Pattern);

        if (pattern.matcher(Password).matches()) {
            System.out.println("Password is set");
            return true;
        } else {
            System.out.println("Please Enter valid input Password is not Set");
            return false;
        }
    }

}
