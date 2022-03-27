package Sort;
import java.util.*;
import java.io.*;
import Sort.Interval;

// [[0, 30],[5, 10],[15, 20]]

public class MeetingRooms {
	
	public static boolean canAttendMeetings(Interval[] intervals) {
		if (intervals == null)
			return false;
		
		Arrays.sort(intervals, new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
			
		});
		
		for (int i=0; i< intervals.length-1; i++) {
			if (intervals[i].end > intervals[i+1].start)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		Interval[] intervals = new Interval[3];
		intervals[0] = new Interval(0, 30);
	    intervals[1] = new Interval(5, 10);
	    intervals[2] = new Interval(15, 20);
		
	    boolean result = canAttendMeetings(intervals);
		System.out.println(result);

	}

}
