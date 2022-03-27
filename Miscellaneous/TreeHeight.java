package AZ;
import java.util.*;

public class TreeHeight {

	public static boolean plantTreesPossible(int trees, int days, int[]arr) {
		
		int array[] = new int[arr.length];
		array = arr.clone();
		
		Arrays.sort(arr);
		int lowest = arr[0];
		int largest = arr[arr.length-1];
		
		int count = 0;
		int n = array.length;
		for (int i = 0; i < array.length; i++) {
		  while (array[i] > arr[i]) {
			  array[i]--;
			  count++;
			  System.out.print(array[i]);
			  System.out.print(" ");
		  }
		  System.out.println();
		  while (array[i] < arr[i]) {
			  array[i]++;
			  count++;
			  System.out.print(array[i]);
			  System.out.print(" ");
		  }
			
		}
		
		System.out.print(count);
		if (count <= days)
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		int trees = 5;
		int days = 13;
		
		int arr[] = { 5, 4, 3, 2, 1 };
		// array = { 5, 4, 3, 2, 1 }
		// arr =   { 1, 2, 3, 4, 5 }
		
		boolean result = plantTreesPossible(trees, days, arr);
		
		if (result)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}
