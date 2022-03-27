package dp;

import java.util.*;
import java.io.*;


//You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

//Example 1:
//coins = [1, 2, 5], amount = 11
//return 3 (11 = 5 + 5 + 1)

public class CoinChange {

	public static int numCoins(int[] coins, int amount) {
		int dp[] = new int[amount + 1];
		Arrays.fill(dp, amount + 1);
		Arrays.sort(coins);
		
		dp[0] = 0;
		
		for (int i = 1; i <= amount; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= i) {
					dp[i] = Math.min(dp[i], 1 + dp[i-coins[j]]);
				} else {
					break;
				}
			}
		}
		
		return dp[amount];
	}
	
	public static void main(String[] args) {
		int coins[] = {1, 2, 5};
		int amount = 11;
		
		int result = numCoins(coins, amount);
		
		System.out.println("Minimum num of denominations is :" + result);
	}

}
