
public class SearchRotatedSortedArray {

	public static int searchNumber(int[] arr, int target) {
		int low = 0;
		int high = arr.length-1;
		
		while (low < high) {
			int mid = (low + high) / 2;
			
			if (arr[mid] > arr[high] && target < arr[mid]) {
				low = mid + 1;
			} else {
				high = mid;
				low++;
			}
		}
		
		return low;
	}
	
	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 1, 2 };
		int target = 4;
		
		int minNum = searchNumber(arr, target);
		
		System.out.println(minNum);
	}
}
