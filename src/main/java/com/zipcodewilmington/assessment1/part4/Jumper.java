package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jumps = 0;
        int spot = 0;
        if (j == k) {return 1;}
        for (int i = 0; spot < k; i++) {
            if ((spot + j) < k) {
                spot += j;
                jumps++;
            } else {
                jumps++;
                spot++;
            }
        }
        return jumps;
    }
}
