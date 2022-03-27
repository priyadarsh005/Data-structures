package AZ;

import java.util.Arrays;

public class MergeTwoArrays {

	public static int[] mergeArray(int[] arr1, int[] arr2) {
		
		int m = arr1.length;
		int n = arr2.length;
		int[] result = new int[m+n];
		
		int i = 0, j = 0, k = 0;
		
		while (i < m) {
			result[k] = arr1[i];
			i++;
			k++;
		}
		while (j < n) {
			result[k] = arr2[j];
			j++;
			k++;
		}
		
		Arrays.sort(result);
		
		return result;
		
	}
	
	public static void main(String[] args) {
		int arr1[] = { 1, 5, 3, 9, 6 };
		int arr2[] = { 9, 5, 7, 2, 4 };
		
		int mergedArray[] = mergeArray(arr1, arr2);
		
		System.out.println("[");
		for (int i = 0; i < mergedArray.length; i++) {
			System.out.println(mergedArray[i] + ",");
		}
		System.out.println("]");
	}

}
