package com.zipcodewilmington.assessment1.part5;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public Integer countPalindromes(String input) {
            Integer count = 0;
            for (int i = 0; i < input.length(); i++) {
                for (int j = input.length(); j > i; j--) {
                    String reversed = new StringBuilder (input.substring(i, j)).reverse().toString();
                    if (input.substring(i, j).equals(reversed)) {
                        count++;
                    }
                }
            }
            return count;
        }
    }