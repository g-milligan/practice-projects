package com.practice.datastructures.array;

import java.util.Arrays;

public class SecondLargest {
    public int getSecondLargestInArray(int[] arr) throws Exception {
        if (arr.length < 2) {
            throw new Exception("Array must contain two or more integers");
        }

        // sort the integers
        Arrays.sort(arr);

        // return the second to last integer
        return arr[arr.length - 2];
    }
}
