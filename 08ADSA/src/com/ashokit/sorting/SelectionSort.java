package com.ashokit.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int a[]=new int[6];
		a[0]=5;
		a[1]=9;
		a[2]=11;
		a[3]=15;
		a[4]=3;
		a[5]=2;
		//int b[]= {5,8,11};
		SelectionSort s= new SelectionSort();
		a=s.selectionSort(a);
		/*
		 * for (int i = 0; i < a.length; i++) { System.out.println(a[i]); }
		 */
		Arrays.stream(a).forEach(p->System.out.println(p));
	}
	
	public int[] selectionSort(int a[]) {//12 =O(1)
		//int[] b=new int[a.length]  =>4n+12 =>O(n)
		//5,9,11,15,3,2-->n
		for (int i = 0; i < a.length-1; i++) {//i=1   ->n+1 //4
			int minIndex=i;//1//4
			for (int j = i+1; j < a.length; j++) {//j=5 ->6<6 -->n(n+1)//4
				if(a[minIndex]>a[j]) {//a[4]>a[5]=> 3>2 (9>9) ->n(n)
					minIndex=j;//4
				}
			}
			//minimum value of the array is present in index 5
			//this index element should swapped with 0th index
			int temp=a[minIndex];//n//4
			a[minIndex]=a[i];//n
			a[i]=temp;//n
			
		}
		//2,9,11,15,3,5
		/*
		n+1		 
		n(n+1) ->n^2+n
		n(n)->n^2
		n
		n
		n
		
		*/
		return a;
	}

}
