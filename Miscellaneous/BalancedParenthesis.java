package Stack;

import java.util.*;
import java.io.*;

public class BalancedParenthesis {

	public static boolean isBalanced(String str) {
		Stack<Character> s = new Stack<>(); // Created Stack
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
				s.push(str.charAt(i));
			} else {
				if (s.isEmpty())
					return false;
				if (str.charAt(i) == ')' && s.peek() != '(' ||
						str.charAt(i) == ']' && s.peek() != '[' ||
						str.charAt(i) == '}' && s.peek() != '{') {
					return false;
				}
				s.pop();
			}
			
		}
		
		return s.isEmpty();
	}
	
	public static void main(String[] args) {
		String str = "([{}])";
		
		boolean result = isBalanced(str);
		
		System.out.println("The String is balanced: ");
		System.out.println(result);
	}
}
