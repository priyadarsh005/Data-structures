
public class MinRotatedSortedArray {

	public static int findMinNumber(int[] arr) {
		int low = 0;
		int high = arr.length-1;
		
		while (low < high) {
			int mid = (low + high) / 2;
			
			if (arr[mid] > arr[high]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		
		return arr[low];
	}
	
	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 1, 2 };
		
		int minNum = findMinNumber(arr);
		
		System.out.println(minNum);
	}
}
