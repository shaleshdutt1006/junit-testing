package com.uservalidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class UserValidatorTest {
    /*
       Taking an Arraylist to check Various email whether it is correct or not and adding emails in the list
  */
    ArrayList<String> arrayList = new ArrayList<>();

    public void setArrayList() {
    /*
    Method to add elements in arraylist to check for patterns
    */
        arrayList.add("abc111@abc.com");
        arrayList.add("abc-100@abc.com");
        arrayList.add("abc.100@yahoo.com");
        arrayList.add("abc+100@gmail.com");
        arrayList.add("abc@1.com");
        arrayList.add("abc-100@yahoo.com");
        arrayList.add("abc_pqr@gmail.com");
        arrayList.add("abc.100@abc.com.au");
        arrayList.add("abc()*@gmail.com");
        arrayList.add("abc@%*.com");
        arrayList.add("abc@abc@gmail.com");
        arrayList.add("abc@gmail.com.1a");
        arrayList.add(".abc@abc.com");
    }

    @Test
    public void givenPassword_WhenProperFormat_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        setArrayList();
        boolean result = validator.vaildateEmail(arrayList);
        Assertions.assertEquals(true, result);
    }
}




