package com.practice.datastructures.binarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TraverseBinaryTreeTest {

    private TraverseBinaryTree unitUnderTest;
    private TreeNode rootNode;

    @BeforeEach
    void setup() {
        unitUnderTest = new TraverseBinaryTree();

        rootNode = new TreeNode(3);

        TreeNode left_1 = new TreeNode(1);
        TreeNode right_1 = new TreeNode(5);
        TreeNode left_left_2 = new TreeNode(9);
        TreeNode right_left_2 = new TreeNode(8);
        TreeNode left_right_2 = new TreeNode(2);
        TreeNode left_left_left_3 = new TreeNode(4);
        rootNode.setLeft(left_1);
        rootNode.setRight(right_1);
        right_1.setLeft(right_left_2);
        left_1.setLeft(left_left_2);
        left_1.setRight(left_right_2);
        left_left_2.setLeft(left_left_left_3);
        /* 
         *   BINARY TREE:
         * 
         *           3
         *       1        5
         *     9   2    8
         *   4  
         */
    }

    @Test
    void testGetTraversedListDepthFirst() {

        ArrayList<Integer> actual = unitUnderTest.getTraversedListDepthFirst(rootNode);

        assertEquals(new ArrayList<>(List.of(
            // depth-first tree node order
            3, 1, 9, 4, 2, 5, 8
        )), actual);
    }
}
