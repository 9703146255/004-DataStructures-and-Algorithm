package com.ashokit.problems;

public class LCMOfNNumbers {
	
	public static void main(String[] args) {
		 int a[]= {2,4,8,15,21};
		 System.out.println(lcm(a));
		 
	}
	
	public static  long lcm(int a[]) {

		int divisor=2;
		long lcm=1;		
		boolean isDivisable=false;		
		while(true) {
			int count=0;
			isDivisable=false;
			for (int i = 0; i < a.length; i++) {				
				if(a[i]==0) {
					return 0;
				}
				if(a[i]==1) {
					count=count+1;
				}
				if(a[i]%divisor==0) {
					isDivisable=true;
					a[i]=a[i]/divisor;
				}
			}
			if(isDivisable) {
				lcm=lcm*divisor;
			}else {
				divisor++;
			}

			if(count==a.length) {
				break;
			}
			
		}
		return lcm;

	}

}
