import java.util.*;

public class ContainerItems {
	
	public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
        int n = s.length();
        int[] dp = new int[n];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                dp[i] = count;
                System.out.print(dp[i]);
            } else {
                count++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < startIndices.size(); i++) {
            int start = startIndices.get(i);
            int end = endIndices.get(i);

            while (s.charAt(start) != '|') 
            	start++;
            
            while (s.charAt(end) != '|') 
            	end--;
            if (start < end) {
                ans.add(dp[end] - dp[start]);
            } else {
                ans.add(0);
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		String s = "|**|*|*";
		List<Integer> startIndices = new ArrayList<Integer>();
		startIndices.add(0);
		startIndices.add(0);
		List<Integer> endIndices = new ArrayList<Integer>();
		endIndices.add(5);
		endIndices.add(3);
		
		List<Integer> res = numberOfItems(s, startIndices, endIndices);
		
		System.out.print('[');
		for (Integer val : res) {
			System.out.print(val);
			System.out.print(' ');
		}
		System.out.print(']');

	}

}
