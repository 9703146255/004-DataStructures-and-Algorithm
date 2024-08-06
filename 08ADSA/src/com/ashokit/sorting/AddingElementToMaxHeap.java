package com.ashokit.sorting;

import java.util.Arrays;
import java.util.Iterator;

public class AddingElementToMaxHeap {

	public static void main(String[] args) {
		int a[]= {15,10,8,7,6,5};
		addElementToMaxHeap(19, a);
	}
	
	static public void addElementToMaxHeap(int elementTOBeInserted,int a[]) {
		
		
		/*
		 * int[] b=new int[a.length+1];
		 * 
		 * 
		 * for (int i = 0; i < a.length; i++) { b[i]=a[i]; }
		 */
		
		int b[]=Arrays.copyOf(a, a.length+1);
		  b[b.length-1]=elementTOBeInserted;
		  
		  int lastElement=b.length-1;
		  while(lastElement>0) {
			  int parentPositionOflastElement=(lastElement-1)/2;
			  if(b[parentPositionOflastElement]<b[lastElement]) {
				  int temp=a[lastElement];
				  a[lastElement]=a[parentPositionOflastElement];
				  a[parentPositionOflastElement]=temp;
				  lastElement=parentPositionOflastElement;//0
			  }else {
				  break;
			  }
		  }
		 
	}
}
