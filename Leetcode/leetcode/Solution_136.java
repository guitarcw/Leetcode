package leetcode;
//Single Number
public class Solution_136 {
	public int singleNumber(int[] nums) {
		if(nums.length==0) return -1;
		for (int i = 1; i < nums.length; i++) {
			nums[i]=nums[i]^nums[i-1];//shit,½ô¼Ç¿¼ÂÇÊ¹ÓÃ|£¬&£¬^,~
		}
		return nums[nums.length-1];
	}

}
