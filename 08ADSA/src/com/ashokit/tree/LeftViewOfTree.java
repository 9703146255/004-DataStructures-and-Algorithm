package com.ashokit.tree;

import java.util.ArrayList;

public class LeftViewOfTree {
	
	static class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
		}


	public static void main(String[] args) {
		LeftViewOfTree lf= new LeftViewOfTree();
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(15);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
		/*
		 * root.right.left = new TreeNode(10); root.left.right.left = new TreeNode(7);
		 * root.left.right.left.left = new TreeNode(9); root.left.right.right = new
		 * TreeNode(8); root.left.right.right.right = new TreeNode(98);
		 * root.left.right.right.left = new TreeNode(11);
		 */
        
        lf.printLeftView(root);
	}
	
	public void printLeftView(TreeNode root) {
	     if (root == null) {
	         return;
	     }
	    
	     //l.add(root.val);
	     ArrayList<Integer> leftViewList = new ArrayList<Integer>();
	     leftViewUtil(root, 1, leftViewList);
	     System.out.println("Left View: " + leftViewList);
	     
	 }

	private void leftViewUtil(TreeNode root, int level, ArrayList<Integer> leftViewList) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		if(leftViewList.size()<level) {
			leftViewList.add(root.val);
		}
		leftViewUtil(root.left,level+1,leftViewList);
		leftViewUtil(root.right,level+1,leftViewList);
		
	}
}
