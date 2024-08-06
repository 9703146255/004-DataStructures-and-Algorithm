package com.ashokit.problems;

import java.util.Scanner;

/*
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 
A B C D E F G 
A B C D E F G H 
A B C D E F G H I 
A B C D E F G H I J */ 

public class PatternPrinting2 {
	
	public static void main(String[] args) {
		char ch1=98;
		System.out.println(ch1);
		System.out.println("Please enter the row count");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for (int i = 1; i <= n; i++) {//i is representing the row i=2
			//Write some logic to print *
			char ch=65;//65
			
			for(int j=1;j<=i;j++) {//j=2<=2
				System.out.print(ch+" ");
				ch++;//66
			}
			System.out.println();
			
		}
	}

}
