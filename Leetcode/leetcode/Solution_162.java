package leetcode;
//162.Find Peak Element
public class Solution_162 {
	public int findPeakElement(int[] nums) {//思想找到一个最大值
		int start=0;
		int end=nums.length-1;
		while(start<end) {
			int mid=(start+end)/2;
			if(nums[mid]<nums[mid+1])
				start=mid+1;
			else end=mid;
		}
		return start;
		
	}
	

}
