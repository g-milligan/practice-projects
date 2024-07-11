package com.practice.datastructures.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OptimizeSecondLargestTest {
    private OptimizeSecondLargest unitUnderTest;

    @BeforeEach
    private void setup() {
        unitUnderTest = new OptimizeSecondLargest();
    }

    @Test
    void whenGivenOneInteger_thenThrow() throws IllegalArgumentException {
        int[] givenArray = new int[] { 4 };

        Exception exception = assertThrows(IllegalArgumentException.class, () -> unitUnderTest.getSecondLargestInArray(givenArray));

        assertEquals("Array must contain two or more integers", exception.getMessage());
    }

    @Test
    void whenGivenTwoOfTheSameIntegers_thenThrow() throws IllegalArgumentException {
        int[] givenArray = new int[] { 3, 3 };

        Exception exception = assertThrows(IllegalArgumentException.class, () -> unitUnderTest.getSecondLargestInArray(givenArray));

        assertEquals("Array must contain at least two distinct integers", exception.getMessage());
    }


    @Test
    void whenGiven5AscendingIntegers_thenReturnSecondLargest() throws IllegalArgumentException {
        int[] givenArray = new int[] { 1, 2, 3, 4, 5 };

        int actual = unitUnderTest.getSecondLargestInArray(givenArray);

        assertEquals(4, actual);
    }

    @Test
    void whenGiven6AscendingIntegers_thenReturnSecondLargest() throws IllegalArgumentException {
        int[] givenArray = new int[] { 12, 35, 1, 10, 34, 1 };

        int actual = unitUnderTest.getSecondLargestInArray(givenArray);

        assertEquals(34, actual);
    }

    @Test
    void whenGivenTwoAscendingIntegers_thenReturnSecondLargest() throws IllegalArgumentException {
        int[] givenArray = new int[] { 2, 3 };

        int actual = unitUnderTest.getSecondLargestInArray(givenArray);

        assertEquals(2, actual);
    }

    @Test
    void whenGivenTwoDescendingIntegers_thenReturnSecondLargest() throws IllegalArgumentException {
        int[] givenArray = new int[] { 3, 2 };

        int actual = unitUnderTest.getSecondLargestInArray(givenArray);

        assertEquals(2, actual);
    }

    @Test
    void testGetSecondLargestInArrayWithDuplicates() throws Exception {
        int[] givenArray = new int[] { 12, 35, 1, 10, 34, 1 };

        int actual = unitUnderTest.getSecondLargestInArray(givenArray);

        assertEquals(34, actual);
    }

    @Test
    void testGetSecondLargestInArrayWithAllDuplicates() {
        int[] givenArray = new int[] { 5, 5, 5 };

        Exception exception = assertThrows(Exception.class, () -> unitUnderTest.getSecondLargestInArray(givenArray));

        assertEquals("Array must contain at least two distinct integers", exception.getMessage());
    }

    @Test
    void testGetSecondLargestInArrayWithNegativeNumbers() throws Exception {
        int[] givenArray = new int[] { -1, -2, -3, -4, -5 };

        int actual = unitUnderTest.getSecondLargestInArray(givenArray);

        assertEquals(-2, actual);
    }

    @Test
    void testGetSecondLargestInArrayWithMixedNumbers() throws Exception {
        int[] givenArray = new int[] { -10, 5, 3, 2, -1, 0 };

        int actual = unitUnderTest.getSecondLargestInArray(givenArray);

        assertEquals(3, actual);
    }

    @Test
    void whenGivenTwoOfTheSameIntegerAndOneUnique_thenReturnSecondLargest() throws IllegalArgumentException {
        int[] givenArray = new int[] { 3, 3, 2 };

        int actual = unitUnderTest.getSecondLargestInArray(givenArray);

        assertEquals(2, actual);
    }
}
