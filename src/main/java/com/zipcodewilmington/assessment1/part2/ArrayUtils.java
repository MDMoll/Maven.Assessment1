package com.zipcodewilmington.assessment1.part2;

import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Integer[] objectArray, Integer objectToCount) {
        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer object : objectArray) {
            if (!object.equals(objectToRemove)) {
                list.add(object);
            }
        }
        return list.toArray(new Integer[list.size()]);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Integer getMostCommon(Integer[] objectArray) {
        Map<Integer, Integer> frequentObject = new HashMap<>();
        for (Integer o : objectArray) {
            Integer c = frequentObject.get(o);
            if (c == null) c = 0;
            c++;
            frequentObject.put(o, c);
        }

        Map.Entry<Integer, Integer> mostRepeated = null;
        for (Map.Entry<Integer, Integer> e : frequentObject.entrySet()) {
            if (mostRepeated == null || mostRepeated.getValue() < e.getValue())
                mostRepeated = e;
        }
        return Integer.parseInt(mostRepeated.getKey().toString());
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Integer getLeastCommon(Integer[] objectArray) {

        /**
         * @param objectArray      an array of any type of Object
         * @param objectArrayToAdd an array of Objects to add to the first argument
         * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
         * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
         */
        Map<Integer, Integer> frequentObject = new HashMap<>();
        for (Integer o : objectArray) {
            Integer c = frequentObject.get(o);
            if (c == null) c = 0;
            c++;
            frequentObject.put(o, c);
        }

        Map.Entry<Integer, Integer> leastRepeated = null;
        for (Map.Entry<Integer, Integer> e : frequentObject.entrySet()) {
            if (leastRepeated == null || leastRepeated.getValue() > e.getValue())
                leastRepeated = e;
        }
        return Integer.parseInt(leastRepeated.getKey().toString());
    }

    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {
        ArrayList<Integer> firstList = new ArrayList<>();
        for (Integer i : objectArray) {
            firstList.add(i);
        }
        for (Integer i : objectArrayToAdd) {
            firstList.add(i);
        }

        return firstList.toArray(new Integer[firstList.size()]);
    }
}
