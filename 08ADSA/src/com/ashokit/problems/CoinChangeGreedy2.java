package com.ashokit.problems;

import java.util.ArrayList;
import java.util.List;

public class CoinChangeGreedy2 {

	static public  void main(String[] args) {
		int[] coins= {1,2,5,10,20,50,100,500,1000};
		int requiredCurreny=93;
		calculateMinCoins(coins,requiredCurreny);
		if(null!=args) {
			System.out.println(args.length);
		}//javac CoinChangeGreedy2.java==>java CoinChangeGreedy2 1 1 1  
	}
	
	static public void calculateMinCoins(int[] coins,int requiredCurreny) {
	List<Integer> l= new ArrayList<>();
		for (int i = coins.length-1; i >=0; i--) {
			
			while(requiredCurreny>=coins[i]) {//43>50
				l.add(coins[i]);//50
				requiredCurreny=requiredCurreny-coins[i];
			}
			
		}
		
		System.out.println("Number of coins required for 93 current is "+l.size());
		System.out.println("Denomination of coins required for 93 current is "+l);
		
	}
}
