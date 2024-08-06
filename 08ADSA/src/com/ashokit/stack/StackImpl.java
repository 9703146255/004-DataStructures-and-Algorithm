package com.ashokit.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackImpl {
	
	public static void main(String[] args) {
		//Is vector/stack allow duplicates ? ->Yes
		//Is vector/Stack ordered ->Yes
		//Is vector/Stack synchronized ->
		//Predefined stack follow array approach
		//LIFO
		int i1=-210;
		//int[] i= new int[-1];
		//List<Integer> l2=new ArrayList<>(-1);
		Stack<Integer> s= new Stack<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(0);
		s.push(11);
		System.out.println(s.peek());//11
		System.out.println(s.peek());//11
		System.out.println(s.peek());//11
		System.out.println(s.peek());//11
		System.out.println(s.peek());//11
		
		System.out.println(s.size());//6
		System.out.println(s.pop());//11
		System.out.println(s.peek());//0
		System.out.println(s.peek());//0
		System.out.println(s.peek());//11
		System.out.println(s.size());//5
		System.out.println(s.pop());//0
		System.out.println(s.size());//4
		System.out.println(s.pop());//40
		System.out.println(s.size());//3
		System.out.println(s.pop());//30
		System.out.println(s.size());//2
		System.out.println(s.pop());//20
		System.out.println(s.size());//1
		System.out.println(s.pop());//10
		System.out.println(s.size());//0
		if(!s.isEmpty())
			System.out.println(s.pop());//Empty Stack Exception
		
		
		
	}

}
