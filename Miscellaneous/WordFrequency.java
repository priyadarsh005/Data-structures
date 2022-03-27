package AZ;
import java.util.*;

public class WordFrequency {

	public static ArrayList<String> maxOccurences(String arr[], int target) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		int value = 0;
		String key = "";
		ArrayList<String> result = new ArrayList<String>();
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (value < entry.getValue()) {
				value = entry.getValue();
				if (value == target) {
					key = entry.getKey();
					result.add(key);
				}
				
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String arr[] = { "geeks", "for", "geeks", "a",
                "portal", "to", "learn", "can", "be",
                "computer", "science", "zoom", "yup",
                "fire", "in", "be", "data", "geeks"};
		
		int target = 3;
		
		ArrayList<String> result = maxOccurences(arr, target);
		
		System.out.print(result);
	}
}
