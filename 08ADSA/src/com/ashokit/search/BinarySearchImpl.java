package com.ashokit.search;

public class BinarySearchImpl {

	public static void main(String[] args) {
		int a[]= {1,5,15,21,31,54,95,100};
		BinarySearchImpl b= new BinarySearchImpl();
		b.binarySearch(a,95);
		String s="Karthik";
		String s1="KarthiK";
		char a1[] =s.toCharArray();
		for (int i = 0; i < a1.length; i++) {
			if(a1[i]==91) {
				
			}
		}
		
		Object[] ob= new Object[9];
		
		//int a1[]=new int[Integer.MAX_VALUE];
		int l=10000;
		int h=2147483647;
		int m=(10000+2147483647)/2;
		System.out.println(m);
		//a[-1073736824]
		int m1=10000+(2147483647-10000)/2;
		System.out.println(m1);
		
		
	}
	
	public void binarySearch(int[] a,int elementToFind) {
		int iterations=0;
		int l=0,h=a.length-1;
		//while(l<h) {//6<7
		for(;l<h;) {
			iterations++;
			int m=(l+h)/2;//m=6+7/2=13/2=6=> l+(h-l)/2 =>l+(h-l)/2
			if(a[m]==elementToFind) {//95==95
				System.out.println("Element is found at position "+m+" in "+iterations+" iterations");
			}
			if(a[m]<elementToFind) {//54<95
				l=m+1;//l=6
			}else {
				h=m;
			}
		}
		
	}
}
