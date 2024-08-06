package com.ashokit.problems;

public class SquareRootImpl {

	public static void main(String[] args) {
		//
		System.out.println(squareRoot(11, 1, 11/2));
	}
	
	static int squareRoot(int n,int start,int end) {
		if(n==0) {
			return 0;
		}
		int mid = 0;
		while(start<end) {
		mid=(start+end)/2;
		if(mid*mid==n) {
			return mid;
		}
		if(mid*mid<n) {
			start=mid+1;
		}else {
			end=mid-1;
		}
		}
		return mid-1;
	}
}
