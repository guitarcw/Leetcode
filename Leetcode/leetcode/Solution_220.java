package leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;

//220.Contain Duplicate |||
public class Solution_220 {
	//absolut difference理解错误
	public static boolean containsNearbyAlmostDuplicate(int[] nums,int k,int t) {
		if(nums.length==0||t<0||k<1) return false;
		TreeSet<Integer> set=new TreeSet<>();
		for(int i=0;i<nums.length;i++) {
			Integer max=set.floor(nums[i]+t);
			Integer min=set.ceiling(nums[i]-t);
			if ((max != null && max >= (long)nums[i]-t)//考虑数据超出int类型范围的情况
                    || (min != null && min <= (long)nums[i]+t)) {
                return true;
            }
			set.add(nums[i]);
			if(i>=k) {
				set.remove(nums[i-k]);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] nums= {0,2147483647};
		containsNearbyAlmostDuplicate(nums, 1, 2147483647);
		
	}

}
