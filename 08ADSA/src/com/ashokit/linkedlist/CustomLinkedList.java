package com.ashokit.linkedlist;

import java.util.LinkedList;

public class CustomLinkedList {	
	Node head;
	Node last;
	//int i;
	static class Node{
		Object data;
		Node next;
		Node(Object data){
			this.data=data;
		}
	}
	public void insert(Object obj) {
		Node n= new Node(obj);
		if(head==null) {
			head=n;
			last=n;
		}else {
			if(last.next==null) {
				last.next=n;
				last=n;
			}
			//head.next=n;
			/*
			Node temp=head;
			while(temp.next!=null) {//20.next
				temp=temp.next;//20
			}
			temp.next=n;*/
		}
	}

	public static void main(String[] args) {
		
		CustomLinkedList cl= new CustomLinkedList();
		cl.insert(10);
		cl.insert(20);
		cl.insert(30);
		
		  LinkedList<Integer> l= new LinkedList<>(); l.add(10); l.add(20); l.add(30);
		  l.remove(); l.remove(2);
		  //l.get(10)
		 
	}
}
