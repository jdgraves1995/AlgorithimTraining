package solutions;

import java.util.Arrays;
import java.util.*;
public class TwoSums {
	
	
	 public static int[] twoSum(int[] nums, int target) {
		 HashMap<Integer,Integer> number = new HashMap<>();
		// int[] outputArray = new int[2];
	     int count = 0;
	     int first = 0, second = 0;
		 for(int index:nums) {
			 number.put(index, count++);
		 }
		 
		 
	        	for(int j = 0; j < nums.length; j++) {
	        	//using j as the "key" pull the value for that key and subtract it from the target. Then see if the hash contains that difference
	        		int tempCandidate = nums[j];
	        		if(number.containsKey(target - tempCandidate) && (number.get(target - tempCandidate) != j)) {
	        			first = j;
	        			second = number.get(target - tempCandidate);
	        	}
	        }
	        
	        	 return new int[]{first,second};
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[] {1,2,5};
		System.out.print(Arrays.toString(twoSum(num, 6)));
	}
}
