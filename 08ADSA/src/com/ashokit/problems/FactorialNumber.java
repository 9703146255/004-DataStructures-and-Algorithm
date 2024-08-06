package com.ashokit.problems;

public class FactorialNumber {

	public static void main(String[] args) {
		System.out.println(factorial(7));
		FactorialNumber f= new FactorialNumber();
		System.out.println(f.fact(7));
	}
	
	static int factorial(int n) {
		int res=1;
		for (int i = 2; i <=n; i++) {//n-1			
			res=res*i;
		}
		return res;
	}
	
	int fact(int n){
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}
}
