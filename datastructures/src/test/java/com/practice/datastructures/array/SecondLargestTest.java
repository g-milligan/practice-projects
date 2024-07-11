package com.practice.datastructures.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecondLargestTest {
    private SecondLargest unitUnderTest;

    @BeforeEach
    void setup() {
        unitUnderTest = new SecondLargest();
    }

    @Test
    void testGetSecondLargestInArray0() throws Exception {
        int[] givenArray = new int[] { 4 };

        Exception exception = assertThrows(Exception.class, () -> unitUnderTest.getSecondLargestInArray(givenArray));

        assertEquals("Array must contain two or more integers", exception.getMessage());
    }

    @Test
    void testGetSecondLargestInArray1() throws Exception {
        int[] givenArray = new int[] { 1, 2, 3, 4, 5 };

        int actual = unitUnderTest.getSecondLargestInArray(givenArray);

        assertEquals(4, actual);
    }

    @Test
    void testGetSecondLargestInArray2() throws Exception {
        int[] givenArray = new int[] { 12, 35, 1, 10, 34, 1 };

        int actual = unitUnderTest.getSecondLargestInArray(givenArray);

        assertEquals(34, actual);
    }
}
