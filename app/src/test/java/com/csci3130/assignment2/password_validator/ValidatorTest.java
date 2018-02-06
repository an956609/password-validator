package com.csci3130.assignment2.password_validator;

import org.junit.Test;

import static com.csci3130.assignment2.password_validator.Validator.*;
import static org.junit.Assert.*;

/**
 * Created by agagne on 05/02/18.
 */
public class ValidatorTest {
    @Test
    public void lengthEnoughTest() {
        assertTrue(lengthEnough("aaaaaaaaaaaaaaaaaa"));
        assertFalse(lengthEnough("a"));
    }

    @Test
    public void isWordPasswordTest() {
        assertFalse(isWordPassword("password"));
        assertFalse(isWordPassword("PassWord"));
        assertTrue(isWordPassword("aaaaaaaaaaaa"));
    }

    @Test
    public void validateTest() {
        assertEquals(2,validate("paaaaaassssssword"));
    }
}