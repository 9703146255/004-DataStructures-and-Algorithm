package com.ashokit.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueImpl {

	public static void main(String[] args) {
		//FIFO
		//LILO
		List<Integer> l1= new LinkedList<>();
		l1.add(10);
		l1.add(20);
		l1.remove(0);
		
		Queue<Integer> l= new LinkedList<>();
		l.add(10);
		l.add(0);
		l.add(110);
		l.add(210);
		l.add(1);
		l.add(16);
		
		System.out.println(l.poll());//10
		System.out.println(l.peek());//0
		System.out.println(l.peek());//0
		System.out.println(l.poll());//0
		System.out.println(l.poll());//110
		System.out.println(l.poll());//210
		System.out.println(l.peek());//1
		System.out.println(l.peek());//1
		System.out.println(l.poll());//1
		System.out.println(l.peek());//16
		System.out.println(l.poll());//16
		System.out.println(l.poll());//null
		
	}
}
