package com.practice.datastructures.binarysearchtree;

import java.util.ArrayList;

import com.practice.datastructures.binarytree.TreeNode;

public class BinarySearchTreeInsertion {
    
    public static TreeNode insert(TreeNode root, int key) {
        // if there is no root node
        if (root == null) {
            // the new key becomes the new root node
            return new TreeNode(key);
        }

        // if the key is less than the current node
        if (key < root.getValue()) {
            // move the key to the left branch of the tree
            root.setLeft(insert(root.getLeft(), key));
        } else if (key > root.getValue()) {
            // move the key to the right branch of the tree
            root.setRight(insert(root.getRight(), key));
        }
        return root;
    }
    
    public static ArrayList<Integer> inorder(TreeNode root) {
        ArrayList<Integer> orderedList = new ArrayList<>();

        if (root != null) {
            orderedList.addAll(inorder(root.getLeft()));

            orderedList.add(root.getValue());

            orderedList.addAll(inorder(root.getRight()));
        }

        return orderedList;
    }

}
