package com.uservalidator;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserValidatorTest {


    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Shalesh Dutt");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenWithSpChar_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Shalesh @Dutt");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenNoSpace_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Shaleshdutt");
        Assertions.assertEquals(false, result);
    }
}




