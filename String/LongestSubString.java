import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

	public static boolean areDistinct(String str, int i, int j) {
		
		boolean[] visited = new boolean[26];
		
		for (int k = i; k <= j; k++) {
			if (visited[str.charAt(k) - 'a' ] == true) {
				return false;
			}
			visited[str.charAt(k) - 'a' ] = true;
		}
		return true;
	}
	
	public static int substringLength(String str) {
		
		int count = 0;
		int len = str.length();

		for (int i = 0; i< len; i++) {
			for (int j = i; j < len; j++) {
				if (areDistinct(str, i, j))
					count = Math.max(count,  j - i + 1);
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		
		int result = substringLength(str);
		
		System.out.println("Longest Substring length is ");
		System.out.println(result);
	}

}
