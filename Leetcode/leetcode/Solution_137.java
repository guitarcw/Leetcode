package leetcode;
//Single Number II 
public class Solution_137 {
	public int singleNumber(int[] nums) {
	int one=0;int two=0;int mask=0;
	for (int i = 0; i < nums.length; i++) {
		two=two^(one&nums[i]);//one and two �����жϸ����Ƿ�ﵽ��ָ���ĸ���
		one=one^nums[i];
		mask=~(one&two);//���ڴﵽ����ʱ�������㣬���߲���
		two=two&mask;
		one=one&mask;
	}
	return one;
	}
//https://leetcode.com/problems/single-number-ii/discuss/ ���
}
