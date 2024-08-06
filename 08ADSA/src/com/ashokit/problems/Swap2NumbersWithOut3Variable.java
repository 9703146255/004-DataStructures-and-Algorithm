package com.ashokit.problems;

public class Swap2NumbersWithOut3Variable {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		/*
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);*/
		
		a=a+b;//10+20;=30 (30-10=20)
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println(a+" "+b);
	}

}
