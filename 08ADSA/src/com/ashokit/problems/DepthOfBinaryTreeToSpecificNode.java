package com.ashokit.problems;


class Node2 {
    int data;
    Node2 left, right;
    
    public Node2(int data) {
        this.data = data;
        left = right = null;
    }
}

public class DepthOfBinaryTreeToSpecificNode {
    Node2 root;
    
    // Recursive function to calculate the depth of a node based on its distance from the root node
    int depth(Node2 node, int target, int level) {
        if (node == null) {
            return -1;
        } else if (node.data == target) {
            return level;
        } else {
            int leftDepth = depth(node.left, target, level + 1);
            int rightDepth = depth(node.right, target, level + 1);
            
            if (leftDepth == -1) {
                return rightDepth;
            } else {
                return leftDepth;
            }
        }
    }
    
    // Driver code to test the depth() function
    public static void main(String[] args) {
    	DepthOfBinaryTreeToSpecificNode tree = new DepthOfBinaryTreeToSpecificNode();
        tree.root = new Node2(1);
        tree.root.left = new Node2(2);
        tree.root.right = new Node2(3);
        tree.root.left.left = new Node2(4);
        tree.root.left.right = new Node2(5);
        tree.root.left.right.right = new Node2(7);
        
        int target = 5;
        int depth = tree.depth(tree.root, target, 0);
        
        System.out.println("The depth of node " + target + " is " + depth);
        
        int sum = tree.sum(tree.root);
        
        System.out.println("The sum of all elements in the binary tree is " + sum);
    }
    
    int sum(Node2 node) {
        if (node == null) {
            return 0;
        } else {
            return node.data + sum(node.left) + sum(node.right);
        }
    }
}


