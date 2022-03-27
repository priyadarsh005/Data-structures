// Given a set of distinct integers, nums, return all possible subsets.

// Note: The solution set must not contain duplicate subsets.

// For example,
// If nums = [1,2,3], a solution is:

// [
//   [3],
//   [1],
//   [2],
//   [1,2,3],
//   [1,3],
//   [2,3],
//   [1,2],
//   []
// ]


import java.util.*;
import java.io.*;

public class Subsets {
	
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        recurse(result, nums, new Stack<>(), 0);
        
        return result;
    }
    
    private static void recurse(List<List<Integer>> result, int[] nums, Stack stack, int position) {
        if(position == nums.length) {
            result.add(new ArrayList<>(stack));
            return;
        }

        stack.push(nums[position]);

        recurse(result, nums, stack, position + 1);
        
        stack.pop();
        
        recurse(result, nums, stack, position + 1);
    }

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		
		List<List<Integer>> result = subsets(arr);
		
		for (List<Integer> numList: result) {
			System.out.println(numList);
		}
	}
}
