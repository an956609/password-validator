package com.csci3130.assignment2.password_validator;

/**
 * Created by agagne on 05/02/18.
 */

public class Validator {
    /**
     * Determines the strenght of the password based on a set of rules.
     * @param password
     * @return number of rules met by the password
     */
    public static int validate(String password) {
        int passed = 0;
        if(lengthEnough(password)) passed++;
        if(wordNotPassword(password)) passed++;
        if(alphaNumeric(password)) passed++;
        if(hasSpecialChar(password)) passed++;
        if(hasUpperAndLower(password)) passed++;
        return passed;
    }

    /*
        determines if the password is longer than 8 characters
     */
    static boolean lengthEnough(String password) {
        return password.length() >=8;
    }

    /*
        determines if the password is the word 'password' without quotes
     */
    static boolean wordNotPassword(String password) {
        return password.compareToIgnoreCase("password") != 0;
    }

    /*
        determines if the password is alpha-numeric
     */
    static boolean alphaNumeric(String password) {
        return password.matches(".*([A-Za-z].*[0-9]|[0-9].*[A-Za-z]).*");
    }

    /*
        determines if the character has non alpha-numeric symbols
     */
    static boolean hasSpecialChar(String password) {
        return password.matches(".*[^A-Za-z0-9].*");
    }

    /*
        determines if the password has both upper and lower case letters
     */
    static boolean hasUpperAndLower(String password) {
        return password.matches(".*([A-Z].*[a-z]|[a-z].*[A-Z]).*");
    }

}
