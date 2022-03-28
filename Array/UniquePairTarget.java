import java.util.*;

public class UniquePairTarget {
	
	public int findUniquePairs(int[] nums, int target) {
		
		HashSet<Integer> seen = new HashSet<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int ans = 0;
		
		for (int num : nums) {
			if (map.containsKey(num)) {
				int key = map.get(num);

				if (!seen.contains(key)) {
					ans++;
					seen.add(key);
				}
				
			} else {
				map.put(target-num, num);
			}
		}
		
		
		return ans;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 1, 2, 45, 46, 46 };
		int target = 47;
		
		UniquePairTarget obj = new UniquePairTarget();
		int numPairs = obj.findUniquePairs(nums, target);
		System.out.println();
		System.out.print(numPairs);
	}

}
