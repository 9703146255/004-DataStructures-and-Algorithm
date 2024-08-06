package com.ashokit.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class FibonaciExample {
//0,1,1,2,3,5,8,13,
	static int sum=0;
	static int count=0;
	static int countDynamic=0;
	Map<String, Integer> m=new HashMap<>();
	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13,21
		FibonaciExample f= new FibonaciExample();
		System.out.println(f.fib(25));//8361
		System.out.println(f.fiboDynamic(25));//8361
		System.out.println("recursion count"+count);
		System.out.println("recursion dynamic count"+countDynamic);
	}
	
	public int fib(int n) {//4//fib(3)//fib(2)
		count++;
		if(n==0 ||n==1) {//
			return n;
		}else {
			return fib(n-1)+fib(n-2);//fib(3)+fib(2)
									//fib(3)=>//fib(2)+fib(1)
									//fib(2)= fib(1)+fib(0)
			
		}
	}
	
	public int fiboDynamic(int n) {//fib(4)
		countDynamic++;
		if(m.containsKey("fiboDynamic"+n)) {
			return m.get("fiboDynamic"+n);
		}
		if(n==0 ||n==1) {//
			m.put("fiboDynamic"+n, n);//m.put(fiboDynamic0,0);
									  //m.put(fiboDynamic1,1);
			  						 //m.put(fiboDynamic2,1);
									//m.put(fiboDynamic3,2);
			return n;
		}else {
			
			sum= fiboDynamic(n-1)+fiboDynamic(n-2);
			m.put("fiboDynamic"+n, sum);
			return sum;
			
			//fiboDynamic(3)+fiboDynamic(2)
			//=fiboDynamic(3)
					//fiboDynamic(2)+fiboDynamic(1)
						//1+1
					//fiboDynamic(2)
					  //      =fiboDynamic(1)+fiboDynamic(0)
								//1+0=1
									
									
			
		}
	}
}
