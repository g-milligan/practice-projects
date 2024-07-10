package com.practice.datastructures.binarytree;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TreeNode {
    private int value;
    private TreeNode left, right;

    public TreeNode(int val) {
        this.value = val;
    }
}
