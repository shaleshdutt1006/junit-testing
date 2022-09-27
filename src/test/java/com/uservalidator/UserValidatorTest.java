package com.uservalidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {


    @org.junit.jupiter.api.Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.vaildateEmail("abc.xyz@bl.co.in");
        Assertions.assertEquals(true, result);
    }

    @org.junit.jupiter.api.Test
    public void givenEmail_WhenNoMandPart_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.vaildateEmail("abc.xyz@pq.co.in");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenemail_WhenNoSpeChar_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.vaildateEmail("abc.xyz.bl.co.in");
        Assertions.assertEquals(false, result);
    }
}




