package leetcode;

import java.util.HashSet;
import java.util.Set;

//217. Contain Duplicate
public class Solution_217 {
	public static boolean containsDuplicate(int[] nums) {
		if(nums.length==0||nums==null) return false;
		Set<Integer> set=new HashSet<>();
		for(int i:nums) {
			if(!set.contains(i)) return true;
			set.add(i);
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0};
		boolean k=containsDuplicate(nums);
	

	}

}
