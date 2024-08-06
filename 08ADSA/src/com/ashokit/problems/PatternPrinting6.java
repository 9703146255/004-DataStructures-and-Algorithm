package com.ashokit.problems;

import java.util.Scanner;

/* Pattern is mentioned below

* * * * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

 
  */

public class PatternPrinting6 {
	
	public static void main(String[] args) {
		System.out.println("Please enter the row count");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for (int i = 1; i <= n; i++) {//i is representing the row i=2
			//Write some logic to print *
			for(int j=n;j>=i;j--) {//j=5 1>=2
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
