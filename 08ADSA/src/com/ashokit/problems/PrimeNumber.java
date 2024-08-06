package com.ashokit.problems;

public class PrimeNumber {

	
	public static void main(String[] args) {
		//7
		isPrime(4);
	}
	
	static boolean isPrime(int n) {//4
		
		if(n<1) {
			return false;
		}
		for (int i = 2; i < n/2; i++) {//n-2//4
				if(n%i==0) {//4%2//n-2
					return false;
				}//2n-2=>O(n)//O(1)
		}
		return true;
	}
}
