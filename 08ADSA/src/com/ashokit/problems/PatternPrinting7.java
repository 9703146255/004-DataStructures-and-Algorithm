package com.ashokit.problems;

import java.util.Scanner;

//Pyramid pattern

public class PatternPrinting7 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the number of rows");
		int n=sc.nextInt();
		int spaces=n-1;
		int starts=1;
		for (int i = 1; i <= n; i++) {//2nd row
			//logic
			for (int j = 1; j <= spaces; j++) {//3
				System.out.print(" ");
			}
			for (int k = 1; k <= starts; k++) {//2
				System.out.print("* ");
			}
			spaces--;
			starts++;			
			System.out.println();
		}
	}

}
