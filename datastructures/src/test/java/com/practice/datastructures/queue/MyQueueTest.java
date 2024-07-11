package com.practice.datastructures.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyQueueTest {
    private MyQueue unitUnderTest;

    @BeforeEach
    void setup() {
        unitUnderTest = new MyQueue();
    }

    @Test
    void testEmpty() {
        unitUnderTest.push(1);
        unitUnderTest.push(2);

        assertEquals(false, unitUnderTest.empty());
    }

    @Test
    void testEmpty1() {
        assertEquals(true, unitUnderTest.empty());
    }

    @Test
    void testPeek() {
        unitUnderTest.push(1);
        unitUnderTest.push(2);

        // first in first out
        assertEquals(1, unitUnderTest.peek());
    }

    @Test
    void testPop() {
        unitUnderTest.push(1);
        unitUnderTest.push(2);

        assertEquals(1, unitUnderTest.pop());
    }
}
