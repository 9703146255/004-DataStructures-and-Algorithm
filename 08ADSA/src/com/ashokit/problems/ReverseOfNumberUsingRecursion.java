package com.ashokit.problems;


public class ReverseOfNumberUsingRecursion{

    // Function to reverse array in Java by swapping the elements
	//Space comp: O(n)
    static void reverseArrayByRecursion(int arr[], int start, int end){
           int t;
           if(start > end)
                return;
           else {
                t = arr[start];
                arr[start] = arr[end];
                arr[end] = t;
           }
           reverseArrayByRecursion(arr, start+1, end-1);
     }
 
    public static void main(String[] args)
    {
                 int[] arr = { 10, 20, 30, 60, 50 };
                 int k, n=arr.length;
                 reverseArrayByRecursion(arr, 0, n-1);


                 // Print the reversed array
                 System.out.println("The reversed array is: \n");
                 for (k = 0; k < arr.length; k++) {
                           System.out.print(arr[k] + ", ");
                  }
    }
}

