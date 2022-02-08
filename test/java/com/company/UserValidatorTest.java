package com.company;
import org.junit.Assert;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
public class UserValidatorTest {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Anshul");
        System.out.println(result);
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Tyagi");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmail_whenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail("abc.xyz@bl.com.");
        Assert.assertTrue(result);
    }
}