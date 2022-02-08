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

  
}