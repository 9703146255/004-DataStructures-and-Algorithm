package com.ashokit.tree;

public class BinarySearchTreeImpl {
	CustomNode root=null;
	
	public static void main(String[] args) {
		
		int i=10;
		
		BinarySearchTreeImpl b= new BinarySearchTreeImpl();
		i=b.display();
		System.out.println(i);
		b.add(10);
		b.add(7);
		b.add(11);
		b.add(5);
		b.add(8);
		b.add(3);
		System.out.println("Min value is "+b.minValue(b.root));;
		System.out.println("Max value is "+b.maxValue(b.root));;
		//b.add(110);
		/*b.add(125);
		b.add(135);
		b.add(125);
		b.add(95);*/
		System.out.println("height of Tree is "+b.heightOfTree(b.root));
		b.leafNodes(b.root);
		b.inOrder(b.root);
		
	}
	
	public void add(Object data) {
		CustomNode n= new CustomNode(data);//130
		if(root==null) {
			root=n;
		}else {
			CustomNode temp=root;//120
			while(true) {
				int rootValue=(Integer)temp.data;//140
				int givenNodeValue=(Integer)data;//130
				if(givenNodeValue<rootValue) {//125<125					
					if(temp.left==null)//140.left=
					{
						temp.left=n;//140.left=130
						return;
					}
					else {
						temp=temp.left;//n =100
					}
				}else {
					if(temp.right==null) {
						temp.right=n;//120.right=130
						return;
					}else {
						temp=temp.right;//temp=140
					}
				}
			}
		}
		System.out.println(root);
	}
	
	static class CustomNode{
		Object data;
		CustomNode left;
		CustomNode right;
		CustomNode(Object data){
			this.data=data;
		}
	}
	
	//https://www.hackerrank.com/challenges/tree-inorder-traversal/problem
	public void inOrder(CustomNode root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(" "+root.data);
			inOrder(root.right);
		}
	}
	
	public void postOrder(CustomNode root) {
		if(root!=null) {
			inOrder(root.left);			
			inOrder(root.right);
			System.out.print(" "+root.data);
		}
	}
	public void preOrder(CustomNode root) {
		if(root!=null) {
			System.out.print(" "+root.data);
			inOrder(root.left);			
			inOrder(root.right);
			
		}
	}
	
	public void leafNodes(CustomNode root) {
		System.out.println("Leaf Node method");
		if(root!=null) {
			if(root.left==null && root.right==null) {
				System.out.println(root.data);
			}else {
				leafNodes(root.left);
				leafNodes(root.right);
			}
		}
	}
	
	int display() {
		return 0;
	}
	//https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
	public int heightOfTree(CustomNode root) {
		if(root==null) {
			return 0;
		}else {
			int leftHeight=0;
			int rightHeight=0;
			leftHeight=heightOfTree(root.left);
			rightHeight=heightOfTree(root.right);
			if(leftHeight>rightHeight) {
				return leftHeight+1;
			}else {
				return rightHeight+1;
			}
		}
	}
	
	//https://www.hackerrank.com/challenges/30-binary-trees/problem
	public void levelOrder(CustomNode root) {
		int h=heightOfTree(root);
		for (int i = 1; i <=h; i++) {
			printNodeAtHeight(root,i);//15,2
		}
	}
	
	public void printNodeAtHeight(CustomNode root,int level) 
	{
		if(root==null) {
			return;
		}
		if(level==1) {
			System.out.print(root.data+" ");
		}else if(level>1) {
			printNodeAtHeight(root.left,level-1);
			printNodeAtHeight(root.right,level-1);
		}		
	}
	//https://www.hackerearth.com/problem/algorithm/mirror-image-1/
	public void mirrorImage(CustomNode root) {
		if(root==null) {
			return;
		}else {
			mirrorImage(root.left);
			mirrorImage(root.right);
			swap(root);
		}
	}
	
	public void swap(CustomNode root) {
		if(root==null) {
			return;
		}
		CustomNode temp=root.left;
		root.left=root.right;
		root.right=temp;
	}
	
	public Object minValue(CustomNode root) {
		Object data=null;
		while(root!=null) {//
			data=root.data;//data=3;
			root=root.left;//null
		}
		return data;
	}
	
	public Object maxValue(CustomNode root) {
		Object data=null;
		while(root!=null) {//
			data=root.data;//data=3;
			root=root.right;//null
		}
		return data;
	}

		
}
