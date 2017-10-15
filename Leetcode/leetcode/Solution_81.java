package leetcode;
//Search in Rotated Sorted Array ||
public class Solution_81 {
	public boolean search (int[] nums,int target) {
		int low=0;
		int high=nums.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(nums[mid]==target) return true;
			if(nums[mid]>nums[high]) {
				if(nums[mid]>target&&nums[low]<=target) high=mid-1;
				else low=mid+1;
			}
			else if(nums[mid]<nums[high]) { 
				if(nums[mid]<target&&nums[high]>=target) low=mid+1;
			    else high=mid-1;
		}
			else high--;}
		
		return false;
		
	}

}
