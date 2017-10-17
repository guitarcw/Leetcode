package leetcode;
//Subsets II

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_90 {
	public List<List<Integer>> subsetWithDup(int[] nums){
		Arrays.sort(nums);
		List<List<Integer>> result=new ArrayList<>();
		List<Integer> temp=new ArrayList<>();
		getSubs(result, temp, nums, 0);
		return result;
		
	}
	public void getSubs(List<List<Integer>> rs,List<Integer> temp,int[] nums,int index) {
		rs.add(new ArrayList<>(temp));
		for(int i=index;i<nums.length;i++) {
			temp.add(nums[i]);
			getSubs(rs, temp, nums, i+1);//i与index区分
			temp.remove(temp.size()-1);
			while(i<nums.length-1&&nums[i]==nums[i+1]) i++;
			
		}
		
	}

}
