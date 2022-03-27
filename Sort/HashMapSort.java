package Sort;
import java.util.*;

public class HashMapSort {
	
	public static Map<String, Integer> sortByValue(Map<String, Integer> hm) {
		
		HashMap<String, Integer> newMap = new LinkedHashMap<String, Integer>();
		
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		for (Map.Entry<String, Integer> entry : list) {
			newMap.put(entry.getKey(), entry.getValue());
		}
		
		return newMap;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		 
        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        Map<String, Integer> hm1 = sortByValue(hm);
        
        for (Map.Entry<String, Integer> entry : hm1.entrySet()) {
        	System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
	}
}
