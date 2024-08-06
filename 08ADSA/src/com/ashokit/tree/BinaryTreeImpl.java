package com.ashokit.tree;

public class BinaryTreeImpl {
	Node root=null;
	static class Node{
		Object data;
		Node left;
		Node right;
		Node(Object data){
			this.data=data;
		}
		//is overloading possible for a constructor
		//overloading-methodname should same ->number of arg, type of arg, order of arg
		//is overriding possible for a constructor
		public static void main(String[] args) {
			BinaryTreeImpl b= new BinaryTreeImpl();
			b.root=new Node(10);
			b.root.left=new Node(8);
			b.root.right=new Node(7);
			b.root.left.left= new Node(5);
			b.root.left.right= new Node(4);
			b.root.right.left=new Node(3);
			b.root.right.right=new Node(2);
			System.out.println("hi");
		}
		
		
	}

}
