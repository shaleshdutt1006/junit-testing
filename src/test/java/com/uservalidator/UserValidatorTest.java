package com.uservalidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    public void FirstName_WhenNotProperFormat_ShouldThrowException() throws CustomException {
        UserValidator validator = new UserValidator();
        try {
            boolean result = validator.validateFirstName("Shal@sh");
            Assertions.assertEquals(true, result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenNotProperFormat_ShouldThrowException() {
        UserValidator validator = new UserValidator();
        try {
            boolean result = validator.validateLastName("Shalesh dutt");
            Assertions.assertEquals(true, result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenMobileNumber_WhenNotProperFormat_ShouldThrowException() {
        UserValidator validator = new UserValidator();
        try {

            boolean result = validator.vaildateMobileNumber("91 94251099");
            Assertions.assertEquals(true, result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNotProperFormat_ShouldThrowException() {
        UserValidator validator = new UserValidator();
        try {
            boolean result = validator.vaildatePassword("Password123");
            Assertions.assertEquals(true, result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldThrowException() {
        UserValidator validator = new UserValidator();
        try {
            boolean result = validator.vaildateEmail("abc.100yahoo.com");
            Assertions.assertEquals(true, result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}




