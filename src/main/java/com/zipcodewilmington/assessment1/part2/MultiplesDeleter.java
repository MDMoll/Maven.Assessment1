package com.zipcodewilmington.assessment1.part2;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        ArrayList odds = new ArrayList();
           for (int i: ints) {
                if (i%2 != 0) {
                    odds.add(i);
        }
    } Integer[] arr = (Integer[])odds.toArray(new Integer[odds.size()]);
           return arr;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList evens = new ArrayList();
        for (int i: ints) {
            if (i%2 == 0) {
                evens.add(i);
            }
        } Integer[] arr = (Integer[])evens.toArray(new Integer[evens.size()]);
        return arr;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList threes = new ArrayList();
        for (int i: ints) {
            if (i%3 != 0) {
                threes.add(i);
            }
        } Integer[] arr = (Integer[])threes.toArray(new Integer[threes.size()]);
        return arr;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList multiples = new ArrayList();
        for (int i: ints) {
            if (i%multiple != 0) {
                multiples.add(i);
            }
        } Integer[] arr = (Integer[])multiples.toArray(new Integer[multiples.size()]);
        return arr;
    }
}
