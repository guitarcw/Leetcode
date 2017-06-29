package leetcode;
/* Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory */
public class Solution_26 {
	public int removeDuplicaties(int[] nums){
		if(nums.length==0) return 0;
		int sum=1;
		int index=nums[0];
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=index){
				sum++;index=nums[i];
				nums[sum-1]=index;
			}
		}
		return sum;
	}

}
