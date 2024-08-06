package com.ashokit.sorting;

import java.util.Arrays;

public class QuickSortExample {
	
	public static void main(String[] args) {
		
		int a[]= {10,7,3,9,0,2,5};
		QuickSortExample q= new QuickSortExample();
		q.sort(a, 0, a.length-1);
		
		Arrays.stream(a).forEach(p->System.out.println(p));
	}
	
	void sort(int a[],int l,int h){
		if(l<h) {
			int pi=partition(a,l,h);
			sort(a,0,pi);
			sort(a,pi+1,h);
		}
	}
	
	int partition(int a[],int l,int h){
		int pivot=a[h];
		int i=l-1;
		for (int j = l; j < a.length; j++) {
			if(a[j]<pivot) {
				i++;
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				
			}
		}
		
		int tem=a[i+1];
		a[i+1]=pivot;
		a[h]=tem;
		return i;
	}

}
