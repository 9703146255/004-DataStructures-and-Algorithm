package com.ashokit.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoWaymerging {
	
	public static void main(String[] args) {
		
		int a[]= {5,8,10,11,13};
		int b[]= {2,3,8,15,17,21};
		TwoWaymerging t= new TwoWaymerging();
		t.twoWayMerge(a, b);
	}
	
	public void twoWayMerge(int a[],int b[]) {
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		//i for A array
		//j for B array
		//k for C Array
		//a.length=4
		//b.length=6
		//int b[]= {5,10,11,13};
		//int a[]= {2,3,8,15,17,21};
		//c=2,3,5,8,10,11,13
		//if(5>2)
		//while(i<a.length && j<b.length){//4<4 && 3<6
		for(;i<a.length && j<b.length;) {
			if(a[i]>b[j]) {//a[3]>b[3] =>13>15
				c[k]=b[j];//c[1]=3
				//c.add(k)=b.get(j);
				j++;//3				
			}else {
				c[k]=a[i];
				i++;//4				
			}
			k++;
		}
		//while(j<b.length) {
		for(;j<b.length;) {
			c[k]=b[j];
			j++;
			k++;
		}
		//while(i<a.length) {
		for(;i<a.length;) {
			c[k]=a[i];
			i++;
			k++;
		}
		//Stream object
		List<Integer> l = new ArrayList<>();
		
		Arrays.stream(c).forEach(p->System.out.println(p));
		/*
		 * for (int l2 = 0; l2 < c.length; l2++) { System.out.println(c[l2]); }
		 */
		
	}

}
