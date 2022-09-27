package com.uservalidator;

import java.util.List;
import java.util.regex.Pattern;

public class UserValidator {

     /*
     Describing Pattern of email and compile it
     */

    String emailRegex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*" + "@([a-zA-Z0-9][-]?)+[.][a-zA-Z]{2,4}([.]{2,4})?$";
    Pattern pattern = Pattern.compile(emailRegex);

    public boolean vaildateEmail(List<String> arrayList) {
        boolean flag = true;
        for (int i = 0; i < arrayList.size(); i++) {

         /*
         using for-loop checking every email whether it matches the defined pattern or not
          */
            if (pattern.matcher(arrayList.get(i)).matches()) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
                flag = false;
            }
        }
        return flag;
    }
}