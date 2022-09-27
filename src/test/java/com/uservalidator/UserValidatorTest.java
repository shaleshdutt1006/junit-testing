package com.uservalidator;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserValidatorTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Shalesh");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("sh");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenWithSpChars_ShouldReturnfalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Sha@lesh");
        Assertions.assertFalse(result);
    }
}




