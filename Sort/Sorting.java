import java.util.*;
import java.util.stream.*;
import java.util.Comparator;

public class Sorting {

	public static void main(String[] args) {
		
		Comparator<String> numericalOrder
        	= AlphanumericSortComparator.NUMERICAL_ORDER;
		
		String[] arr = {
                "1",
                "2",
                "10",
                "22",
                "3",
                "7",
                "100",
                "50"
        };

	    Arrays.sort(arr, numericalOrder);
	    
	    System.out.println(Arrays.toString(arr));
	}

}
