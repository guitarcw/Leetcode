package leetcode;
//153. Find Minimum in Rotated Sorted Array
public class Solution_153 {
	public int findMin(int[] nums) {
		if(nums.length==0||nums==null) return 0;
		if(nums.length==1) return nums[0];
		int pre=0;
		int ant=nums.length-1;
		while(pre!=ant) {
			if(nums[pre]<nums[ant]) return nums[pre];//�������з�����ת�����
			int mid=(pre+ant)/2;
			if(nums[ant]>nums[mid]) //mid�Ƿ�+1������������
				ant=mid;
			else pre=mid+1;
		}
		return nums[ant];
		
	}

}
