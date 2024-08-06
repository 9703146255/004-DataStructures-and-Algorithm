package com.ashokit.sorting;

import java.util.Arrays;

public class HeapSort {
	//Convert the given array into Maxheap
	public static void main(String[] args) {
		int a[]= {5,15,9,21,1,6,4};
		heapSort(a);
	}
	
	public static void heapSort(int[] a) {
		
		int n=a.length;//7
		//0 to n/2-1 all parents
		//n/2 to n== all childrens are present
		for(int i=n/2-1;i>=0;i--){//7/2-1=>3-1=2
			a=heapify(i,a,n);//heapify(0,a,7)
		}
		for(int j=n-1;j>0;j--) {//j=5
			
            int temp = a[0];//n
            a[0] = a[j];
            a[j] = temp;
            
            heapify(0,a,j);
		}
		System.out.println(a);
		
	}
	
	public static int[] heapify(int i, int a[],int length) { //{heapify(0,a,7)
		int parentPosition=i;//parentPosition=0
		int lc=2*i+1;//1
		int rc=2*i+2;//2
		//int a[]= {21,5,9,15,1,6,5};
		if(lc<length && a[parentPosition]<a[lc]) {//a[0]<a[1]=>5<21
			parentPosition=lc;//1
		}
		if(rc <length && a[parentPosition]<a[rc]) {//a[1]<a[2]=>21<9
			parentPosition=rc;
		}
		if(parentPosition!=i) {
			int swap = a[i];
            a[i] = a[parentPosition];
            a[parentPosition] = swap;
            heapify(parentPosition,a,length);
		}
		return a;
	}

}
