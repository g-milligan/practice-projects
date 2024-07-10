package com.practice.datastructures.hashing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyHashTest {

    private MyHash unitUnderTest;

    @BeforeEach
    private void setup() {
        unitUnderTest = new MyHash();

        unitUnderTest.put(8, "Thank you God for life");
        unitUnderTest.put(7, "Thank you Jesus for giving your life");
        unitUnderTest.put(6, "Hi World");
    }

    @Test
    void testGetAndSize() {
        assertEquals("Thank you Jesus for giving your life", unitUnderTest.get(7).getValue());
        assertEquals(3, unitUnderTest.size());
    }

    @Test
    void testGetNull() {
        assertEquals(null, unitUnderTest.get(99));
    }

    @Test
    void testRemoveAndSize() {
        assertEquals("Hi World", unitUnderTest.remove(6).getValue());
        assertEquals(2, unitUnderTest.size());
    }

    @Test
    void testRemoveNull() {
        assertEquals(null, unitUnderTest.remove(77));
        assertEquals(3, unitUnderTest.size());
    }

    @Test
    void testContainsTrue() {
        assertEquals(true, unitUnderTest.contains("Thank you God for life"));
    }

    @Test
    void testContainsFalse() {
        assertEquals(false, unitUnderTest.contains("Hola Mundo"));
    }

    @Test
    void testMyEntryToString() {
        assertEquals("{key:6, value:Hi World}", unitUnderTest.get(6).toString());
    }

    @Test
    void testPutUpdateExisting() {
        unitUnderTest.put(6, "updated value"); 
        assertEquals("updated value", unitUnderTest.get(6).getValue());
    }

    @Test
    void testContainsKeyTrue() {
        assertEquals(true, unitUnderTest.containsKey(7));
    }

    @Test
    void testContainsKeyFalse() {
        assertEquals(false, unitUnderTest.containsKey(99));
    }
}
