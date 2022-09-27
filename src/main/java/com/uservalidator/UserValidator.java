package com.uservalidator;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String Email_Pattern = "[abc]{1,3}" + "[.]" + "[a-z 0-9]{1,}" + "[@]" + "bl{1}" + "[.]" + "co{1}" + "[.]" + "[a-z]{1,}";

    public boolean vaildateEmail(String email) {
        Pattern pattern = Pattern.compile(Email_Pattern);
        return pattern.matcher(email).matches();
    }


}
