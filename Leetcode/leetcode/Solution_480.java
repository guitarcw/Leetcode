package leetcode;

import java.util.PriorityQueue;

/*Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.*/
public class Solution_480 {
	public double[] medianSlidingWindow(int[] nums, int k) {
        int length=nums.length;
        PriorityQueue<Integer> min=new PriorityQueue<>();
		PriorityQueue<Integer> max=new PriorityQueue<>();
	double[] out=new double[length-k+1];
	for (int i = 0; i <length; i++) {
		
		if(i<k-1) {
			min.add(nums[i]);
			max.add(-min.poll());
			if (min.size()<max.size()) {
				min.add(-max.poll());
			}
			
		}
		else{
			
			out[i]=min.size()>max.size()?min.peek():0.5*((double)min.peek()-max.peek());
		}
		      
    }
	return out;
}
	}
