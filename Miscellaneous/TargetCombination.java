package AZ;
import java.util.*;
import java.io.*;

public class TargetCombination {
	
	public static void printAllSumRec(int target, int curr_sum, int start, ArrayList<Integer> result, ArrayList<ArrayList<Integer>> output) {
		
		if (curr_sum == target) {
			output.add((ArrayList)result.clone());
		}
		
		for (int i = start; i < target; i++) {
			int temp_sum = curr_sum + i;
			
			if (temp_sum <= target) {
				result.add(i);
				printAllSumRec(target, temp_sum, i, result, output);
				System.out.println("Result");
				System.out.println(result);
				result.remove(result.size()-1);
			} else
				return;
		}
		
	}
	
	public static ArrayList<ArrayList<Integer>> printAllSum(int target) {
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		printAllSumRec(target, 0, 1, result, output);
		return output;
		
	}

	public static void main(String[] args) {
		int target = 5;
		
		ArrayList<ArrayList<Integer>> arrayList = printAllSum(target);
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("[");
			for (int j = 0; j < arrayList.get(i).size(); j++) {
				System.out.println(arrayList.get(i).get(j) + ", ");
			}
			System.out.println("]");
		}
		
	}

}
