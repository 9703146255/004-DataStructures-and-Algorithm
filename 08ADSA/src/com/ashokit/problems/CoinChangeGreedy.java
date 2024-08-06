package com.ashokit.problems;

//Java program to find minimum
//number of denominations
import java.util.Vector;

class CoinChangeGreedy
{

	// All denominations of Indian Currency
	static int deno[] = {1, 2, 5, 10, 20,
	50, 100, 500, 1000};
	static int n = deno.length;

	static void findMin(int V)
	{
		// Initialize result
		Vector<Integer> ans = new Vector<>();

		// Traverse through all denomination
		for (int i = n - 1; i >= 0; i--)
		{
			// Find denominations
			while (V >= deno[i])
			{
				V -= deno[i];
				ans.add(deno[i]);
			}
		}

		// Print result
		for (int i = 0; i < ans.size(); i++)
		{
			System.out.print(
				" " + ans.elementAt(i));
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		int n = 93;
		System.out.print(
			"Following is minimal number "
			+"of change for " + n + ": ");
		findMin(n);
	}
}
//For example, it doesn’t work for denominations {9, 6, 5, 1} and V = 11. The above approach would print 9, 1 and 1. But we can use 2 denominations 5 and 6. 



//This code is contributed by 29AjayKumar

