package dp;

import java.util.*;
import java.io.*;

public class LongestCommonSubsequence {
	
	public static int f(String s1, String s2, int i, int j) {
		
		if (i < 0 || j < 0) return 0;
		
		if (s1.charAt(i) == s2.charAt(j)) 
			return 1 + f(s1, s2, i-1, j-1);
		
		return Math.max(f(s1, s2, i-1, j), f(s1, s2, i, j-1));
		
		
	}

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "acde";
		
		int m = s1.length();
		int n = s2.length();
		
		int result = f(s1, s2, m-1, n-1);
		
		System.out.println("Longest Common Subsequence is :");
		System.out.println(result);
	}
}
