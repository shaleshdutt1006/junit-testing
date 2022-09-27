package com.uservalidator;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String MobileNumber_Pattern = "^91{1}" + "\s" + "[0-9]{10,}$";

    public boolean vaildateMobileNumber(String MobileNumber) {
        Pattern pattern = Pattern.compile(MobileNumber_Pattern);
        return pattern.matcher(MobileNumber).matches();

    }

}
