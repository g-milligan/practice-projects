package com.practice.datastructures.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MinHeapTest {

    private MinHeap unitUnderTest;

    @BeforeEach
    private void setup() {
        unitUnderTest = new MinHeap(15);

        unitUnderTest.insert(5);
        unitUnderTest.insert(3);
        unitUnderTest.insert(17);
        unitUnderTest.insert(10);
        unitUnderTest.insert(84);
        unitUnderTest.insert(19);
        unitUnderTest.insert(6);
        unitUnderTest.insert(22);
        unitUnderTest.insert(9);
    }

    @Test
    void testRemove() {
        int actual = unitUnderTest.remove();

        assertEquals(3, actual);
    }
}
