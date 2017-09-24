package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_46 {
public List<List<Integer>> permute(int[] nums) {
	List<List<Integer>> list=new ArrayList<>();
	List<Integer> temp=new ArrayList<>();
	if(nums.length==0||nums==null) return list;
	get(list, temp, nums, 0);
	return list;
        
    }
public void get(List<List<Integer>> list,List<Integer> temp,int[] nums,int start) {
	if(temp.size()==nums.length) list.add(new ArrayList<>(temp));
	else for (int i = start; i < nums.length; i++) {
		swap(nums, start, i);
		temp.add(nums[i]);
		get(list, temp, nums, start+1);
		temp.remove(temp.size()-1);
		swap(nums, start, i);
	}
}
private void swap(int[] nums,int i,int j) {
	int temp=nums[i];
	nums[i]= nums[j];
	nums[j]=temp;
}

}
