package com.practice.datastructures.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {

    private ReverseLinkedList unitUnderTest;

    @BeforeEach
    private void setup() {
        unitUnderTest = new ReverseLinkedList();
    }

    @Test
    void testReverseLinkedList() {
        LinkedNode node1 = new LinkedNode("Cat");
        LinkedNode node2 = new LinkedNode("Mouse");
        LinkedNode node3 = new LinkedNode("Bird");
        LinkedNode node4 = new LinkedNode("Squirrel");
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        LinkedNode actual = unitUnderTest.ReverseTheList(node1);

        assertEquals(node4, actual);
        assertEquals(node3, actual.getNext());
        assertEquals(node2, actual.getNext().getNext());
        assertEquals(node1, actual.getNext().getNext().getNext());
    }
}
