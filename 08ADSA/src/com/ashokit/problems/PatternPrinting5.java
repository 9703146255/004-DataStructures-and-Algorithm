package com.ashokit.problems;

import java.util.Scanner;
/* Pattern printing for the below
https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
    A
   AB
  ###
 ####
#####

 */
public class PatternPrinting5 {
	
	public static void main(String[] args) {
		System.out.println("Please enter the row count");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();//5
		for (int i = 1; i <= n; i++) {//i is representing the row 
			//Write some logic to print *//i=2
			//i=1
			for(int j=1;j<=n;j++) {//j=4  4<=5
				if((i+j)>n) {//2+4>5
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}

}
