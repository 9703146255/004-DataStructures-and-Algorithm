package com.ashokit.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UniqueElementsOfArray {
	
	public static void main(String[] args) {
		 int a[]= {1,2,3,4,1,2,3,10,12,13,1};
		 Set<Integer> s=new HashSet<>();
		 Set<Integer> duplicateSet=new HashSet<>();
		 for (int i = 0; i < a.length; i++) {
			if(!s.contains(a[i])) {
				s.add(a[i]);
			}else {
				duplicateSet.add(a[i]);
			}
		}
		 System.out.println(s);
		 System.out.println(duplicateSet);
		 //Can you write without Set
		// Arrays.sort(a);
		 //
		 //int a[]= {1,2,3,4,1,2,3,10,12,13,1};
		 int[] uniqueElementArray= new int[a.length];//11
		 int k=0;
		 for (int i = 0; i < a.length; i++) {//i=6//n+1
			boolean duplicateElementFound=false;
			 for (int j = 0; j <i ; j++) {//j=2 2<6//0-0
				 if(a[i]==a[j]) {//a[6]==a[2]//3==3
					 duplicateElementFound=true;
					 break;
				 }
			}
			 
			 if(!duplicateElementFound) {
				 uniqueElementArray[k]=a[i];//1,2,3,4,10,12,13,0,0,0,0//7
				 k++;
			 }			 
		}
		 System.out.println(Arrays.toString(uniqueElementArray));
		 uniqueElementArray= Arrays.copyOf(uniqueElementArray, k);
		 //int c[]=new int[k]
		 //for(int i=0;i<k;i++){
		 //c[i]=uniqueElementArray[i]
		 //}
		 System.out.println(Arrays.toString(uniqueElementArray));
	}

}
