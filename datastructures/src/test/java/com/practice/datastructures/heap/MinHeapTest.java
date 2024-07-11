package com.practice.datastructures.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * MinHeapTest class contains unit tests for the MinHeap class.
 */
public class MinHeapTest {

    private MinHeap unitUnderTest;

    @BeforeEach
    void setup() {
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

    @Test
    void testMultipleRemoves() {
        assertEquals(3, unitUnderTest.remove());
        assertEquals(5, unitUnderTest.remove());
        assertEquals(6, unitUnderTest.remove());
        assertEquals(9, unitUnderTest.remove());
        assertEquals(10, unitUnderTest.remove());
    }

    @Test
    void testInsertIntoEmptyHeap() {
        MinHeap emptyHeap = new MinHeap(10);
        emptyHeap.insert(42);
        assertEquals(42, emptyHeap.remove());
    }

    @Test
    void testRemoveFromEmptyHeap() {
        MinHeap emptyHeap = new MinHeap(10);
        assertThrows(IllegalStateException.class, emptyHeap::remove);
    }

    @Test
    void testHeapPropertyMaintenance() {
        unitUnderTest.insert(1);
        assertEquals(1, unitUnderTest.remove());
        assertEquals(3, unitUnderTest.remove());
        unitUnderTest.insert(0);
        assertEquals(0, unitUnderTest.remove());
    }

    @Test
    void testHeapFullCondition() {
        for (int i = 0; i < 6; i++) {
            unitUnderTest.insert(i + 90);
        }
        assertEquals(3, unitUnderTest.remove());
    }

    @Test
    void testConstructorValidation() {
        assertThrows(IllegalArgumentException.class, () -> new MinHeap(0));
    }

}
