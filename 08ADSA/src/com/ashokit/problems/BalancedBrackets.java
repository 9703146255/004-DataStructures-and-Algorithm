package com.ashokit.problems;

//https://www.hackerrank.com/challenges/java-stack/problem

import java.util.*;
class BalancedBrackets{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
            String s = sc.next();
            System.out.println(isBalanced(s));
        }
        sc.close();
	}
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.isEmpty() || (c == ')' && stack.pop() != '(') || 
                       (c == '}' && stack.pop() != '{') || (c == ']' && stack.pop() != '[')) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}




