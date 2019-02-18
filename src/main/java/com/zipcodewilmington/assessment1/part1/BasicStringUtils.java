package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String output = new StringBuilder(str).reverse().toString();
        return output.substring(0,1).toUpperCase() + output.substring(1).toLowerCase();
        //str.substring(1);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        StringBuilder cutoffString = new StringBuilder(str);
        cutoffString.deleteCharAt(0);
        return cutoffString.deleteCharAt(cutoffString.length() - 1).toString();
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char letter;
        String message = "";
        for (int i = 0; i < str.length(); i++) {
            letter = str.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                letter = (char) (letter - 32);
            } else if (str.charAt(i) >= 'A' && letter <= 'Z') {
                letter = (char) (letter + 32);
            }
            message += letter;
        }
        return message;
    }
}