import java.util.*;

public class OptimalBoxWeight {
	public static List<Integer> findOptimalList(int[] arr) {
		
		List<Integer> res = new ArrayList<>();
		
		Arrays.sort(arr);
		
		int totalWeight = 0;
		int minWeight = 0;
		
		for (int i = arr.length-1; i >=0; i--) {
			totalWeight+= arr[i];
		}
		
		minWeight = totalWeight / 2 + 1;
		int currWeight = 0;
		
		int j = arr.length - 1;
		while (currWeight <= minWeight) {
			currWeight+= arr[j];
			res.add(arr[j]);
			j--;
		}
		
		return res;	
	}
	
	
	public static void main(String[] args) {
		int arr[] = { 3, 7, 5, 6, 2 };
		
		List<Integer> list = findOptimalList(arr);
		
		System.out.print('[');
		for (Integer val : list) {
			System.out.print(val);
			System.out.print(' ');
		}
		System.out.print(']');
	}

}
