package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
//
//Each number in C may only be used once in the combination.

public class Solution_40 {
public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	List<List<Integer>> list=new ArrayList<>();
	List<Integer> temp=new ArrayList<>();
	if(target<=0|| candidates.length==0) return list;
	Arrays.sort(candidates);
	get(list, temp, candidates, target, 0);
	return list;    
    }
public void get(List<List<Integer>> list,List<Integer> temp,int[] nums,int remain,int start) {
	if(remain<0) return;
	else if(remain==0) list.add(new ArrayList<>(temp));
	else for(int i=start;i<nums.length;i++) {
		if(i>start&&nums[i]==nums[i-1]) continue;
		temp.add(nums[i]);
		get(list, temp, nums, remain-nums[i], i+1);
		temp.remove(temp.size()-1);
	}
}

}
