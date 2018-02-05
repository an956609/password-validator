package com.csci3130.assignment2.password_validator;

import org.junit.Test;

import static com.csci3130.assignment2.password_validator.Validator.*;
import static org.junit.Assert.*;

/**
 * Created by agagne on 05/02/18.
 */
public class ValidatorTest {
    @Test
    public void lengthTest() {
        assertTrue(length("aaaaaaaaaaaaaaaaaa"));
        assertFalse(length("a"));
    }

    public void passwordTest() {
        assertFalse(password("password"));
        assertFalse(password("PassWord"));
        assertTrue(password("aaaaaaaaaaaa"));
    }
}