package com.practice.datastructures.binarysearchtree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.practice.datastructures.binarytree.TreeNode;

public class BinarySearchTreeInsertionTest {

    private TreeNode rootNode;

    @BeforeEach
    private void setup() {
        rootNode = new TreeNode(4);
        rootNode.setLeft(new TreeNode(2));
        rootNode.setRight(new TreeNode(7));
        rootNode.getLeft().setLeft(new TreeNode(1));
        rootNode.getLeft().setRight(new TreeNode(3));
        /* 
         *   BINARY TREE:
         * 
         *           4
         *       2        7
         *     1   3    
         */
    }

    @Test
    void testInorder() {
        BinarySearchTreeInsertion.insert(rootNode, 5);
        ArrayList<Integer> actual = BinarySearchTreeInsertion.inorder(rootNode);

        /* 
         *   INSERT 5 INTO BINARY TREE:
         * 
         *            4
         *       2           7
         *     1   3    (5)
         */
        assertEquals(new ArrayList<>(List.of(
            1, 2, 3, 4, 5, 7
        )), actual);
    }
}
