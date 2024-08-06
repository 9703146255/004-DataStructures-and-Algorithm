package com.ashokit.problems;

public class ReverseArrayWithOutUsingExtraMemory {
	public static void main(String[] args) {
		
		int a[]= {4,3,2,5,1};
		int b[]=new int[a.length];
		int j=0;
		for (int i = a.length-1; i >=0; i--) {
			b[j]=a[i];
			j++;
		}
		
		for(int i=0,j1=a.length-1;i<j1;i++,j1--) {//i=2;j=2 (1<3)
			int temp=a[i];//temp=3
			a[i]=a[j1];//a[1]=a[3]=5
			a[j1]=temp;//a[3]=a[1]=3
			//Swap without temp
			/*
			 * a[i]=a[i]+a[j1];//10+20;=30 (30-10=20) a[j1]=a[i]-a[j1];//30-20=10
			 * a[i]=a[i]-a[j1];//30-10=20
			 */			//{1,5,2,3,4}
		}
	}

}
