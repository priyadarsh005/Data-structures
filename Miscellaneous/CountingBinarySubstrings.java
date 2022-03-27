package AZ;
import java.util.*;

// Conditions
// 0's and 1's are grouped consecutively (Eg: 01, 10, 0011, 1100, 00011 )
// Number of 0s in the substring should be equal to number of 1s in the substring.

public class CountingBinarySubstrings {

	public static int numberOfSubstrings(String str) {
	
		int currConsecutive = 1;
		int prevConsecutive = 0;
		int numSubStrings = 0;
		
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i-1)) {
				currConsecutive++;
			} else {
				prevConsecutive = currConsecutive;
				currConsecutive = 1;
				numSubStrings+= Math.min(currConsecutive, prevConsecutive);
			}
		}
		
		System.out.print("currConsecutive : " + currConsecutive);
		System.out.println();
		System.out.print("prevConsecutive : " + prevConsecutive);
		
		return numSubStrings + Math.min(currConsecutive, prevConsecutive);
	}
	
	public static void main(String[] args) {
		String str = "001101";
		
		int result = numberOfSubstrings(str);
		
		System.out.print(result);
	}
}
