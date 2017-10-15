package leetcode;
//Remove Duplicates from Sorted Array ||
public class Solution_80 {
public int removeDuplicates(int[] nums) {//利用本身数组做标识
	int i=0;
	for(int num:nums) {
		if(i<2||nums[i-2]<num) {
			nums[i]=num;
			i++;
		}
	}
	return i;
}
}
