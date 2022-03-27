import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
	    int [] answer = new int[2];
	    Map<Integer,Integer> values = new HashMap<Integer,Integer>();
	    for ( int i=0; i < nums.length; i++){
	        values.put(nums[i],i);
	    }
	    for ( int i=0; i < nums.length; i++){
	        int val = target - nums[i];
	        Integer secondIndex = values.get(val);
	        if ( secondIndex != null && secondIndex != i){
	            answer[0] = i;
	            answer[1] = secondIndex;
	            return answer;
	        }
	    }
	    return answer;
	}

	public static void main(String[] args) {
		int nums[] = { 3, 2, 4 };
		int target = 6;
		
		int[] result = twoSum(nums, target);
		
		System.out.println("Result");
		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);

	}

}
