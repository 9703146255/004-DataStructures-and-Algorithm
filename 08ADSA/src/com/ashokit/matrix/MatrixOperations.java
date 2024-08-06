package com.ashokit.matrix;

public class MatrixOperations {

	public static void main(String[] args) throws Exception {
		int a[][]=new int[2][2];
		//0,0 -> 0,1 -> 1,0 ->1,1
		a[0][0]=2;
		a[0][1]=4;
		a[1][0]=6;
		a[1][1]=8;
		
		int b[][]= {{2,5},{6,8}};
		int c[][]= {
				    {2,4,5,6},
				    {2,4,5,6}
					};//1*4
		int g[][]= {{1,2,3},{4,5,6}};
		transpose(g);
		addMatrix(a, b);
		int d[][]= {{4},{5}};//{{4,5}}
		matrixMultiplication(a,d);
		int a1[]= {2,4,5,6};
		System.out.println(a1.length);//it will print column
		System.out.println(c.length);//it will give rows - in 2 or multidimentional array
		System.out.println(c[0].length);//it will give rows - in 2 or multidimentional array
	}
	
	static void addMatrix(int a[][], int b[][]) throws Exception {
		int c[][]=null;
		
		if(null!=a && null!=b) {
			int rows=a.length;
			int columns=a[0].length;
			if(!(a.length==b.length && a[0].length ==b[0].length)) {
				throw new Exception("Matrix addition is not possible as the rows and columns of given matrix are not same");
			}else {
				 c=new int[rows][columns];
				for (int i = 0; i < rows; i++) {//i=1
					for (int j = 0; j < columns; j++) {//j=0
						c[i][j]=a[i][j]+b[i][j];//a[1][1]+b[1][1]
					}
				}
			}
		}
		System.out.println(c);
	}
	
	static void matrixMultiplication(int a[][], int b[][]) throws Exception {
		int c[][]=null;
		
		if(null!=a && null!=b) {
			int rows=a.length;
			int columns=b[0].length;
			if(!(a[0].length==b.length)) {
				throw new Exception("Matrix multiplication is not possible as the columns of first matrix is not matching with rows of second matrix");
			}else {
				 c=new int[rows][columns];
				for (int i = 0; i < rows; i++) {//i=0
					int sum=0;
					for (int j = 0; j < columns; j++) {//j=0
						 for (int k = 0; k < a[0].length; k++) {//k=1
			                    sum += a[i][k] * b[k][j];
			                    //a[0][0]+b[0][0]
			                    //a[0][1]*b[1][0]
			                }

			                c[i][j] = sum;
					}
				}
			}
		}
		System.out.println(c);
	}
	
	public static void transpose(int a[][]) {
		int rows=a.length;
		int columns=a[0].length;
		int b[][]=new int[columns][rows];
		//int a[][]=new[rows][columns]
		for (int i = 0; i < rows*columns; i++) {
			int row=i%rows;
			int column=i/rows;
			b[column][row]=a[row][column];
		}
		
		System.out.println(" Transpose of Matrix is ");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(" Transpose of Matrix is *********");
	}
	
	public boolean isSymetric(int a[][]) {
		//4 4
		//4 4
		int rows=a.length;//2
		int columns=a[0].length;//2
		
		if(rows!=columns) {
			return false;
		}
		for (int i = 0; i < rows; i++) {//i=1//--------> n+1
			for (int j = 0; j <columns; j++) {//j=0 ===>n(n+1)->n^2+n=n^2
				if(a[i][j]!=a[j][i]) {//a[1][0]=a[0][1]
					return false;
				}
			}
		}
		return true;
	}
	
}
