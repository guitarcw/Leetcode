package leetcode;

public class Solution_35 {
	public int searchInser(int[] nums,int target){
		int start=0;
		int middle=0;
		int end=nums.length-1;
		if(nums.length==0) return middle;
		while(end>=start){
			middle=(start+end)/2;
			if(nums[middle]==target) {return middle;
			}
			else{
				if(nums[middle]>target) end=middle-1;
				else start=middle+1;
			}
		}
		if(nums[middle]<target) return middle+1;
		else return middle;
	}

}
