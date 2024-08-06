package com.ashokit.problems;

public class SearchForMissingNumber {

	public static void main(String[] args) {
		 int a[]= {1,4,3,5,8,7,2};
		 //n(n+1)/2 =8(9)/2=36
		 int sum=0;
		 for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		 int sumOfNaturalNumbers=sumOfNaturalNumbers(a.length+1);
		 int missingNumber=sumOfNaturalNumbers-sum;
		 System.out.println(missingNumber);
		 
	}
	
	static int sumOfNaturalNumbers(int n) {
		return (n*(n+1))/2;
	}
}
