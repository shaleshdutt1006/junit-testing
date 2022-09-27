package com.uservalidator;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String First_Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";

    /*
    Method to validate First Name Of the User with first letter Capital and at least three Character
     */
    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(First_Name_Pattern);
        return pattern.matcher(fname).matches();
    }

    private static final String Last_Name_Pattern = "^[A-Z]{1,}[a-z]{3,}+\s+[A-Z]{1,}[a-z]{2,}$";

    /*
    Method to validate Last Name Of the User with first letter Capital and at least three Character
     */
    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(Last_Name_Pattern);
        return pattern.matcher(lname).matches();
    }

    private static final String MobileNumber_Pattern = "^91{1}" + "\s" + "[0-9]{10,}$";

    /*
    Method to validate mobile number with country code and 10 digits
    */
    public boolean vaildateMobileNumber(String MobileNumber) {
        Pattern pattern = Pattern.compile(MobileNumber_Pattern);
        return pattern.matcher(MobileNumber).matches();
    }

    private static final String Password_Pattern = "(?=.*[A-Z])" + "(?=.*[0-9])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$)" + ".{8,}";

    /*
     Validating password which has at least 8 character one uppercase letter and one numeric number and
      at least one special character and no whitespace allowed
     */
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

    private static final String Email_Pattern = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*" + "@([a-zA-Z0-9][-]?)+[.][a-zA-Z]{2,4}([.]{2,4})?$";

    /*
    Validating email with Special Character and .com and some numeric words
     */
    public boolean vaildateEmail(String email) {
        Pattern pattern = Pattern.compile(Email_Pattern);
        return pattern.matcher(email).matches();

    }
}