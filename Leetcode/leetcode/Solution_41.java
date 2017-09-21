package leetcode;
//Given an unsorted integer array, find the first missing positive integer.
//
//For example,
//Given [1,2,0] return 3,
//and [3,4,-1,1] return 2.

//Your algorithm should run in O(n) time and uses constant space.

public class Solution_41 {
public int firstMissingPositive(int[] nums) {
	for(int i=0;i<nums.length;) {
		if(nums[i]<1||nums[i]>nums.length||nums[i]==i+1) i++;
		else if(nums[nums[i]-1]!=nums[i]) swap(nums,i,nums[i]-1);
		else i++;
	}
	int i=0;
	while(i<nums.length&&nums[i]==i+1) i++;
	return i=1;
        
    }
public void swap(int[] nums,int m,int n) {
	int temp=nums[m];
	nums[m]=nums[n];
	nums[n]=temp;
}

}
