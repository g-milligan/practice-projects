package com.practice.datastructures.array;

public class OptimizeSecondLargest {
    
    // in order to optimize the time efficiency, this solution will not use sorting
    public int getSecondLargestInArray(int[] arr) {

        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain two or more integers");
        }

        // start with really small values that are guaranteed to be replaced
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // just loop through the array once O(n) linear time complexity
        // as the number of items, n, increases by 1, then 
        // the time complexity only linearly increases by 1
        for(int number: arr) {
            // this new number is bigger than the previous largest
            if (number > firstLargest) {
                // the first largest now becomes the second largest, so far
                secondLargest = firstLargest;

                // set the new largest number, so far
                firstLargest = number;

            // number isn't bigger than the first largest, but is it bigger than the second? 
            } else if (number != firstLargest && number > secondLargest) {

                // update second largest
                secondLargest = number;
            }
        }

        if (Integer.MIN_VALUE == secondLargest) {
            throw new IllegalArgumentException("Array must contain at least two distinct integers");
        }

        return secondLargest;
    }
}
