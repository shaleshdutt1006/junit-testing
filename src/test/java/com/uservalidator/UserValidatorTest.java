package com.uservalidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    @Test
    public void givenPassword_WhenProperFormat_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.vaildatePassword("password123");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenLessDigits_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.vaildatePassword("kjasda");
        Assertions.assertEquals(true, result);
    }

}




