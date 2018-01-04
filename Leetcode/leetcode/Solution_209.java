package leetcode;
//209.Minimum Size Subarray Sum
public class Solution_209 {
	//类似窗格的方法
	public static int minSubArrayLen(int s, int[] nums) {
		int min=nums.length,sum=0;
		int len=0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
			len++;
			if(sum>=s) {
				while(sum>=s) {
					if(sum-nums[i+1-len]>=s) {
						sum-=nums[i+1-len];
						len--;
					}
					else break;
				}
				min=Math.min(min, len);
			}
		}
		if(sum<s) return 0;
		return min;
	}
	public static void main(String[] args) {
		int[] nums= {2,3,1,2,4,3};
		System.out.println(minSubArrayLen(7,nums));
	}
}
