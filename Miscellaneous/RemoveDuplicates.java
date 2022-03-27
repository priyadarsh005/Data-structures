package AZ;
import java.util.*;
import java.io.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4};
		Set<Integer> set = new HashSet<Integer>();
			
		for (int i=0; i< arr.length; i++) {
			set.add(arr[i]);
		}
		
		System.out.println(set);	
	}
}
