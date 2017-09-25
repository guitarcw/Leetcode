package leetcode;
//Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
//
//For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
//the contiguous subarray [4,-1,2,1] has the largest sum = 6.
public class Solution_53 {
	public int maxSubArray(int[] nums) {
		if(nums==null||nums.length==0) return 0;
		int sum=0,max=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(max>0&&sum<0) while(nums[i]<=0)  i++;
			else {sum+=nums[i];
			if(sum>max) max=sum;//�ж����ֵ
			if(sum<0) sum=0;
			
			}
		}
		return max;
	
	}

}
