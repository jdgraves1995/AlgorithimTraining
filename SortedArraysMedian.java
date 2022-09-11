package solutions;
import java.util.*;
		
public class SortedArraysMedian {
	
	
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 	
		    double mid;
		    double first;
		    double last;
		    double median = 0;
		    ArrayList<Integer> list = new ArrayList<>();
		    
		    	for(int iter: nums1) {
		    		list.add(iter);
		    	}
		    	for(int iter: nums2) {
		    		list.add(iter);
		    	}
		    	Collections.sort(list);
		    	
		    int length = list.size();
		    first = list.get(0);
		    last = list.get(length - 1);
		    mid = (first + last)/2;
		    if (mid % 2 == 0) {
		    	median = (list.get(mid)) + list.get(mid + .5)) / 2;
		    }
		    else {
		    	median = mid;
		    }
		    	
		 	return	median; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[] {1,3,4,5};
		int[] nums2 = new int[] {2,6};
		
		System.out.print(findMedianSortedArrays(nums1, nums2));
		
	}

}
