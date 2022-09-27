package com.uservalidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    @Test
    public void givenPassword_WhenProperFormat_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.vaildatePassword("Password123#");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WithoutSpecialChar_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.vaildatePassword("passWord12");
        Assertions.assertEquals(true, result);
    }

}




