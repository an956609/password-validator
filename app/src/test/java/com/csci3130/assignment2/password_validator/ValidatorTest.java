package com.csci3130.assignment2.password_validator;

import org.junit.Test;

import static com.csci3130.assignment2.password_validator.Validator.*;
import static org.junit.Assert.*;

/**
 * Created by agagne on 05/02/18.
 */
public class ValidatorTest {
    /**
     * a2-stage1: tests length identifying method
     */
    @Test
    public void lengthEnoughTest() {
        assertTrue(lengthEnough("aaaaaaaaaaaaaaaaaa"));
        assertFalse(lengthEnough("a"));
    }

    /**
     * a2-stage1: tests that the word is not password
     */
    @Test
    public void wordNotPasswordTest() {
        assertFalse(wordNotPassword("password"));
        assertFalse(wordNotPassword("PassWord"));
        assertTrue(wordNotPassword("aaaaaaaaaaaa"));
    }

    /**
     * a2-stage2: tests that there is a character and a number in the password
     */
    @Test
    public void alphaNumericTest() {
        assertFalse(alphaNumeric("abcdefghij"));
        assertFalse(alphaNumeric("1304920392039"));
        assertTrue(alphaNumeric("abcdef7h"));
        assertTrue(alphaNumeric("0bcdefgh"));
        assertTrue(alphaNumeric("abcdefg8"));
        assertTrue(alphaNumeric("abc_3"));
        assertTrue(alphaNumeric("4-def"));
    }

    /**
     * a2-stage2: tests that there is a special character
     */
    @Test
    public void hasSpecialCharTest() {
        assertFalse(hasSpecialChar("abytheis298u4sj"));
        assertTrue(hasSpecialChar("ajdf_ho-rioiefa98$@"));
        assertTrue(hasSpecialChar("abc-def_gh"));
    }

    /**
     * a2-stage2: test that has upper and lower case
     */
    @Test
    public void hasUpperAndLowerTest() {
        assertFalse(hasUpperAndLower("password"));
        assertFalse(hasUpperAndLower("PASSWORD"));
        assertFalse(hasUpperAndLower("1204859839"));
        assertTrue(hasUpperAndLower("Password"));
        assertTrue(hasUpperAndLower("passworD"));
        assertTrue(hasUpperAndLower("pasSWOrd"));
    }

    /**
     * a2-stage1 and 2: tests the total number of tests passed is equal to intended
     */
    @Test
    public void validateTest() {
        assertEquals(2,validate("paaaaaassssssword"));
        assertEquals(5,validate("Th!sIsMyP4$$w0rd"));
    }
}