package leetcode;
//213.House Robber ||
public class Solution_213 {
	public int rob(int[] nums) {
		if(nums.length==1) return nums[0];
		return Math.max(robHelper(nums, 0, nums.length-1), robHelper(nums, 1, nums.length));
		
	}
	private int robHelper(int[] nums,int start,int end) {
		int ifPreRob=0,ifPreNotRob=0;
		for(int i=start;i<end;i++) {
			int temp=ifPreRob,temp1=ifPreNotRob;
			ifPreRob=ifPreNotRob+nums[i];
			ifPreNotRob=Math.max(temp, temp1);
		}
		return Math.max(ifPreRob, ifPreNotRob);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
