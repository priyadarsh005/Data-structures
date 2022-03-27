package dp;
import java.util.*;
import java.io.*;

// Climbing steps to reach top - 1 step or 2 steps. Total n steps
public class ClimbingStairs {

	public static int findSteps(int n) {
		int dp[] = new int[n+1];
		
		dp[0] = 1;
		dp[1] = 1;
		
		for (int i=2; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
	
	public static void main(String[] args) {
		int n = 3;
		int result = findSteps(n);
		
		System.out.println("Number of steps : " + result);
	}

}
