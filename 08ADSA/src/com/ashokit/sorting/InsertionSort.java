package com.ashokit.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InsertionSort {
	
	public static void main(String[] args) {
		int a[]= {15,2,5,3,8,1};
		a=sort(a);
		System.out.println(Arrays.toString(a));
		
		List<String> l= new ArrayList<>();
		l.add("Karthik");
		l.add("Ajay");
		l.add("Akshay");
		l.add("Pradeep");
		
		Collections.sort(l);
	}
	
	static public int[] sort(int a[]) {//12==O(1)
		
		for (int i = 1; i < a.length; i++) {//n//4
			int key=a[i];//n//4
			int j=i-1;//n//4
			while(j>=0 && a[j]>key) {//n*n
				a[j+1]=a[j];//n*n
				j--;//n*
			}
			a[j+1]=key;
		}
		return a;
	}

}
