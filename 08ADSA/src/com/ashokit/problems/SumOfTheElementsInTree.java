package com.ashokit.problems;

class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;

    TreeNode2(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class BinaryTree1 {
    TreeNode2 root;

    BinaryTree1() {
        root = null;
    }

    // Recursive function to calculate the sum of all elements in the binary tree
    int getSum(TreeNode2 node) {
        if (node == null)
            return 0;

        return node.val + getSum(node.left) + getSum(node.right);
    }

    // Wrapper function to calculate the sum of all elements in the binary tree
    int sumOfElements() {
        return getSum(root);
    }
}

public class SumOfTheElementsInTree {
    public static void main(String[] args) {
        // Create a sample binary tree
        BinaryTree1 tree = new BinaryTree1();
        tree.root = new TreeNode2(1);
        tree.root.left = new TreeNode2(2);
        tree.root.right = new TreeNode2(3);
        tree.root.left.left = new TreeNode2(4);
        tree.root.left.right = new TreeNode2(5);
        tree.root.right.left = new TreeNode2(6);
        tree.root.right.right = new TreeNode2(7);

        int sum = tree.sumOfElements();
        System.out.println("Sum of all elements in the binary tree: " + sum);
    }
}

