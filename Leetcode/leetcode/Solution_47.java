package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_47 {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> list=new ArrayList<>();
		List<Integer> temp=new ArrayList<>();
		if(nums.length==0||nums==null) return list;
		Arrays.sort(nums);
		get(list, temp, nums, 0);
		return list;
	        
	    }
	public void get(List<List<Integer>> list,List<Integer> temp,int[] nums,int start) {
		if(temp.size()==nums.length) {list.add(new ArrayList<>(temp)); return;}
		else {
			List<Integer> com=new ArrayList<>();//ÅĞ¶ÏÎ»ÖÃÊÇ·ñÖØ¸´
			for (int i = start; i < nums.length; i++) {
			if(i>start&&com.contains(nums[i])) continue;
			com.add(nums[i]);
			swap(nums, start, i);
			temp.add(nums[start]);
			get(list, temp, nums, start+1);
			temp.remove(temp.size()-1);
			swap(nums, start, i);		
		}
			
		}
	}
	private void swap(int[] nums,int i,int j) {
		int temp=nums[i];
		nums[i]= nums[j];
		nums[j]=temp;
	}

}
