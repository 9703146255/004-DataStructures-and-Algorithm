package com.ashokit.problems;

import java.util.Scanner;

/*
1 
1 2 
1 2 3 
1 2 3 4 
*/ 

public class PatternPrinting3 {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter the row count");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();//4
		for (int i = 1; i <= n; i++) {//i is representing the row i=2
			//Write some logic to print *
			//char ch=65;//65
			
			for(int j=1;j<=i;j++) {//j=2<=2
				System.out.print(j+" ");
				//ch++;//66
			}
			System.out.println();
			
		}
	}

}
