package leetcode;

import java.util.Arrays;

public class Solution_16 {
	public int threeSumClosest(int[] nums,int target){
		int result=nums[0]+nums[1]+nums[nums.length-1];
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-2; i++) {
			int start=i+1;int end=nums.length-1;
			while (start<end) {
				int sum=nums[i]+nums[start]+nums[end];
				if(sum>target) end--;
				else start++;
				if(Math.abs(target-sum)<Math.abs(target-result))
					result=sum;
			}
		}
		return result;
	}

}
