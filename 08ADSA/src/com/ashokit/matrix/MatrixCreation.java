package com.ashokit.matrix;

import java.util.Scanner;

public class MatrixCreation {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
        int rows = s.nextInt();//2

        System.out.print("Enter the number of columns: ");
        int columns = s.nextInt();//5
        
        int a[][]=new int[rows][columns];
        int totalNoOfelementinArray=rows*columns;
        
        int b[][]= {{2,1,3},{3,1,2},{4,3,2}};
        
        //(0,0),(0,1),(0,2),(0,3),(0,4)
        //(1,0),(1,1),(1,2),(1,3),(1,4)
        
        for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Please enter the data for "+(i+","+j)+"co-ordinates");
				a[i][j] = s.nextInt();
			}
		}
        //System.out.println(a);
        for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
        s.close();
	}
}
