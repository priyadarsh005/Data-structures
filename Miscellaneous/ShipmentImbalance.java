package AZ;
import java.util.*;

public class ShipmentImbalance {
	
	public static int findTotalImbalance(int arr[]) {
		int len = arr.length;
		int imbalanceTotal = 0;
		ArrayList<Integer> imbalance = new ArrayList<Integer>(); 
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		int k = 0;
		while (k < len) {
			for (int i = 0; i < len; i++) {
				List<Integer> list = new ArrayList<Integer>();
				for (int j = 0; j <= i; j++) {
					if (j+k < len) {
						list.add(arr[j+k]);
					}
				}
				
				System.out.print(list);
				result.add((ArrayList<Integer>) list);
				Collections.sort(list);
				
				int minWeight = list.get(0);
				int maxWeight = list.get(list.size() - 1);
				
				imbalance.add(maxWeight - minWeight);	
			}
			k++;
		}
		
		for (Integer count : imbalance) {
			imbalanceTotal+= count;
		}
		
		return imbalanceTotal;
	}
	
	public static void main(String[] args) {
		int arr[] = { 3, 1, 2, 4 };
		
		int result = findTotalImbalance(arr);
		System.out.print(result);
	}

}
