import java.util.*;
import java.io.*;

public class LongestConsecutiveSequence {

	static int calculateLongestConsecutiveSequence(int[] arr) {
		
		Arrays.sort(arr);
		int count = 1;
		
		for (int i=0; i< arr.length; i++) {
			if (i+1 >= arr.length)
				break;
			
			if (arr[i+1] - arr[i] == 1)
				count++;
			else
				continue;
		}
		
		
		return count;

	}
	
	
	public static void main(String[] args) {
		int arr[] = {100, 4, 200, 1, 3, 2};
		// 1 2 3 4 100 200
		
		int result = calculateLongestConsecutiveSequence(arr);
		
		System.out.println("Result is");
		System.out.println(result);

	}

}
