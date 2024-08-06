package com.ashokit.sorting;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int a[]={4,5,7,31,45,60};//4n
		BubbleSort b= new BubbleSort();
		b.bubbleSort(a);//13
		char ch='A';//1
		System.out.println((66>ch));
		b.display();//10
		
		//Total=4n+24=>O(N)
		/*
		 * int A=10, B=15; A=A+B; A=A-B; B=A-B;
		 */
	}
	
	public void bubbleSort(int a[]) {	//0(6*6=36)//13 bytes==>O(1)
		
		//4,5,7,31,45,60		
		for (int i = 0; i < a.length-1; i++) {//i=5<5;--4
			boolean isSortedArray=true;//1
			for (int j = 0; j < a.length-1-i; j++) {//4
				if(a[j]>a[j+1]) {//45>60
					isSortedArray=false;
					int temp=a[j];//	4				
					a[j]=a[j+1];
					a[j+1]=temp;			
				}
			}
			if(isSortedArray)
				break;
			
		}
		
		System.out.println(a);
		/*for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
		Arrays.stream(a).forEach(p->System.out.println(p));
		List<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(1);
		l.add(0);
		//l.stream().forEach(null);
		
		
	}
	
	
	public void display() {
		LocalDateTime ld= LocalDateTime.now();
		
		LocalDateTime ld1= LocalDateTime.now();
		Duration d= Duration.between(ld, ld1);
		System.out.println("Duration "+d.toNanos());
		//0(1)
	}

}
