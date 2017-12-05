package leetcode;
//Single Number II 
public class Solution_137 {
	public int singleNumber(int[] nums) {
	int one=0;int two=0;int mask=0;
	for (int i = 0; i < nums.length; i++) {
		two=two^(one&nums[i]);//one and two 用于判断个数是否达到，指定的个数
		one=one^nums[i];
		mask=~(one&two);//用于达到个数时，给清零，否者不变
		two=two&mask;
		one=one&mask;
	}
	return one;
	}
//https://leetcode.com/problems/single-number-ii/discuss/ 详解
}
