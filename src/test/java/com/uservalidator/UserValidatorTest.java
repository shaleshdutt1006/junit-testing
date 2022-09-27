package com.uservalidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Shalesh");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Shalesh Dutt");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenMobileNumber_WhenProperFormat_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.vaildateMobileNumber("91 9425109980");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenProperFormat_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.vaildatePassword("Password123#");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenProperFormat_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.vaildateEmail("abc.100@yahoo.com");
        Assertions.assertEquals(true, result);
    }
}




