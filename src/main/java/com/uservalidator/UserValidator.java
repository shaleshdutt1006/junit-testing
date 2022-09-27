package com.uservalidator;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String Password_Pattern = ".{8,}";

    public boolean vaildatePassword(String Password) {
        Pattern pattern = Pattern.compile(Password_Pattern);
        return pattern.matcher(Password).matches();

    }

}
