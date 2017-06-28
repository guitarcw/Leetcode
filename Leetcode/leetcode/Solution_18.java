package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_18 {
	public List<List<Integer>> fourSum(int[] nums,int target){
		ArrayList<List<Integer>> out=new ArrayList<>();
		Arrays.sort(nums);
		int len=nums.length;
		for (int i = 0; i < len-3; i++) {
			//if(nums[i]>target) break;
			if(i==0||nums[i-1]!=nums[i]){
				for (int j = i+1; j < len-2; j++) {
					//if(nums[j]>target-nums[i]) break;
					if( j==i+1||nums[j-1]!=nums[j]){
						int low=j+1;int high=len-1;
						while (low<high) {
						int	sum=nums[i]+nums[j]+nums[low]+nums[high];
							if(sum==target){
								out.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
								 while (low < high && nums[low] == nums[low+1]) low++;
				                 while (low < high && nums[high] == nums[high-1]) high--;
				                 low++; high--;
							}else if(sum>target) high--;
							else low++;
							
						}
					}
				}
				
			}
		}
		return out;
	}
	

}
