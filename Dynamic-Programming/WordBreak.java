package dp;

import java.util.*;
import java.io.*;

public class WordBreak {
	
	public static boolean wordBreak(String s, Set<String> wordDict) {
		boolean[] dp = new boolean[s.length()+1];
		
		dp[0] = true;
		
		for (int len = 1; len <= s.length(); len++) {
			for (int i = 0; i < len; i++) {
				if (dp[i] && wordDict.contains(s.substring(i, len))) {
					dp[len] = true;
					break;
				}
			}
		}
		
		return dp[s.length()];
	}

	public static void main(String[] args) {
		// For example, given
		// s = "leetcode",
		// dict = ["leet", "code"]
		
		String s = "leetcode";
		Set<String> wordDict = new HashSet<String>();
		
		wordDict.add("leet");
		wordDict.add("code");
		
		boolean result = wordBreak(s, wordDict);
		System.out.println("Result ");
		System.out.println(result);
		
	}

}
