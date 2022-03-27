
public class MaxProductSubarray {
	
	public static int maxProduct(int[] arr) {
		
		if (arr.length == 0)
			return 0;
		
		int maxProduct = arr[0];
		int minProduct = arr[0];
		int sol = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			// new Min
			int temp1 = Math.min( minProduct * arr[i], maxProduct * arr[i]);
			// new Max
			int temp2 = Math.max( minProduct * arr[i], maxProduct * arr[i]);
			minProduct = Math.min(temp1, arr[i]);
			maxProduct = Math.max(temp2, arr[i]);
			sol = Math.max(sol,  maxProduct);
		}
		
		return sol;
	}

	public static void main(String[] args) {
		int arr[] = {2, 3, -2, 4, 1};
		
		int result = maxProduct(arr);
		
		System.out.println(result);
	}

}
