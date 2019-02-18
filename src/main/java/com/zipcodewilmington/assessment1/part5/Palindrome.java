package com.zipcodewilmington.assessment1.part5;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    int perms = 0;

    public Integer countPalindromes(String input) {
        int count = 0;
        ArrayList<String> perms = new ArrayList<>();
        if (input.length() == 1) {
            perms.add(input);
            count++;
        } else {
            String chr = input.substring(0, 1);
            String rest = input.substring(1);
            ArrayList<String> subPerms = new ArrayList<String>();
            subPerms.add(rest);
            for (String s : subPerms) {
                for (int j = 0; j <= s.length(); j++) {
                    String newPerm = s.substring(0,j) + chr + s.substring(j);
                    perms.add(newPerm);
                }
            }
        }
        return perms.size();
    }
}