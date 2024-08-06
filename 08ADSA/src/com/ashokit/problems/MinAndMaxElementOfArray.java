package com.ashokit.problems;

public class MinAndMaxElementOfArray {
	public static void main(String[] args) {
		
		int a[]= {31,2,5,1,32,321,8};
		//min=1, max=321
		int minValue=a[0];
		int maxValue=a[0];
		for(int i=1;i<a.length;i++) {//n+1
			if(minValue>a[i]) {//n
				minValue=a[i];//n
			}
			if(minValue<a[i]) {//n
				maxValue=a[i];//n
			}
		}
		
		/*
		 * for() {//n+1 for() {//n(n+1)
		 * 
		 * } }
		 */
		//O(N^2)
			
		//5n+1 ==>O(n)
		
	}
}
