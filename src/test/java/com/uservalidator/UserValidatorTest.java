package com.uservalidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    @Test
    public void givenMobileNumber_WhenProperFormat_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.vaildateMobileNumber("91 9425109980");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenMobileNumber_WhenLessDigits_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.vaildateMobileNumber("91 942510998");
        Assertions.assertEquals(true, result);
    }

}




