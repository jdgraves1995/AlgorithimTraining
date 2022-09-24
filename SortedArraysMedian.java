package solutions;
import java.util.*;
		
public class SortedArraysMedian {
	
	
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 	
		    double median;
		    ArrayList<Integer> list = new ArrayList<>();
		    
		    	for(int iter: nums1) {
		    		list.add(iter);
		    	}
		    	for(int iter: nums2) {
		    		list.add(iter);
		    	}
		    	Collections.sort(list);
		    	
		    int length = list.size();		    
		    
		    if (length % 2 == 0) {
		    	double last  = list.get(length / 2);
		    	double first = list.get((length /2)-1);
		    	median = (first + last)/2;
		    }
		    else {
			    median = list.get(length/2);
		    }
		    	
		 	return	median; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[] {3};
		int[] nums2 = new int[] {-1,-2};
		
		System.out.print(findMedianSortedArrays(nums1, nums2));
		
	}

}
