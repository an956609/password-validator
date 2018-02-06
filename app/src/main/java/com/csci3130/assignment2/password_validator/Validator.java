package com.csci3130.assignment2.password_validator;

/**
 * Created by agagne on 05/02/18.
 */

public class Validator {
    public static int validate(String password) {
        int passed = 0;
        if(lengthEnough(password)) passed++;
        if(wordNotPassword(password)) passed++;
        return passed;
    }

    static boolean lengthEnough(String password) {
        return password.length() >=8;
    }

    static boolean alphaNumeric(String password) {

        return false;
    }

    static boolean hasSpecialChar(String password) {

        return false;
    }

    static boolean hasUpperAndLower(String password) {

        return false;
    }

    static boolean wordNotPassword(String password) {
        return password.compareToIgnoreCase("password") != 0;
    }
}
