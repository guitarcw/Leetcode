package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_39 {
public List<List<Integer>> combinationSum(int[] candidates, int target) {
	List<List<Integer>> list=new ArrayList<>();
	List<Integer> temp=new ArrayList<>();
	if(target<0||candidates.length==0||candidates==null) 
	return list;
	get(list, temp, candidates, target, 0);
    return list;
    }
public void get(List<List<Integer>> list,List<Integer> temp,int[] nums,int remain,int start) {
	if(remain<0) return;
	else if(remain==0) list.add(new ArrayList<>(temp));
	else for (int j = start; j < nums.length; j++) {
		temp.add(nums[j]);
		get(list, temp, nums, remain-nums[j], j);//起始位置确定，j
		temp.remove(temp.size()-1);
	}
}

}
