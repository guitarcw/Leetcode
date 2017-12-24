package leetcode;
//169. Majority Element
public class Solution_169 {
//ץס��Ŀ����������Ŀ����1/2
	public int majorityElement(int[] nums) {
		int majority=nums[0], count=0;
		for (int i : nums) {
			if(majority==i) count++;
			else if(count==0) {majority=i;
			count++;
			}
			else count--;
		}
		return majority;
		
	}

}
