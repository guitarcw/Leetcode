package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

//219.Contain Duplicate ||
public class Solution_219 {
	
	/*public boolean containsNearbyDuplicate(int[] nums,int k) {
		LinkedList<Integer> compare=new LinkedList<>();
		for(int i=0;i<=k&&i<nums.length;i++) {
			if(compare.contains(nums[i])) return true;
			compare.add(nums[i]);
		}
		for(int i=k+1;i<nums.length;i++) {
			compare.removeFirst();
			if(compare.contains(nums[i])) return true;
			compare.add(nums[i]);
		}
		return false;
	}*/
	///Status: Time Limit Exceeded
	
	public boolean containsNearbyDuplicate(int[] nums,int k) {
		Set<Integer> compare=new HashSet<>(); //使用错误的数据结构，导致时间上使用过多
		for(int i=0;i<=k&&i<nums.length;i++) {
			if(compare.contains(nums[i])) return true;
			compare.add(nums[i]);
		}
		for(int i=k+1;i<nums.length;i++) {
			compare.remove(nums[i-k-1]);
			if(compare.contains(nums[i])) return true;
			compare.add(nums[i]);
		}
		return false;
	}
	
	
	

}
