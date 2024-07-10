package com.practice.datastructures.binarytree;

import java.util.ArrayList;

public class TraverseBinaryTree {

    private ArrayList<Integer> getAllChildrenDepthFirst(TreeNode node) {
        ArrayList<Integer> traversedList = new ArrayList<>();
        
        if (node.getLeft() != null) {
            traversedList.add(node.getLeft().getValue());

            // recursive call
            traversedList.addAll(getAllChildrenDepthFirst(node.getLeft()));
        }

        if (node.getRight() != null) {
            traversedList.add(node.getRight().getValue());

            // recursive call
            traversedList.addAll(getAllChildrenDepthFirst(node.getRight()));
        }

        return traversedList;
    }
    
    public ArrayList<Integer> getTraversedListDepthFirst(TreeNode rootNode) {
        ArrayList<Integer> traversedList = new ArrayList<>();
        traversedList.add(rootNode.getValue());

        traversedList.addAll(getAllChildrenDepthFirst(rootNode));

        return traversedList;
    }
}
