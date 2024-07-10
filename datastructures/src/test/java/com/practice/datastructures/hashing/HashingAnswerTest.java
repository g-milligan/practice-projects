package com.practice.datastructures.hashing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HashingAnswerTest {

    private HashingAnswer unitUnderTest;

    @BeforeEach
    private void setup() {
        unitUnderTest = new HashingAnswer(10);
    }

    @Test
    void testPutGet() {
        unitUnderTest.put(0, 7);
        assertEquals(7, unitUnderTest.get(0));
    }

    @Test
    void testRemove() {
        unitUnderTest.put(3, 7);
        unitUnderTest.remove(3);
        assertEquals(-1, unitUnderTest.get(3));
    }

    @Test
    void test() {
        unitUnderTest.put(1, 1);
        unitUnderTest.put(2, 2);
        assertEquals(1, unitUnderTest.get(1));
        assertEquals(-1, unitUnderTest.get(3));

        unitUnderTest.put(2, 1);
        assertEquals(1, unitUnderTest.get(2));

        unitUnderTest.remove(2);
        assertEquals(-1, unitUnderTest.get(2));
    }
}
