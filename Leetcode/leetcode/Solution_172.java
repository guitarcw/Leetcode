package leetcode;
//172.factorial Trailing zeroes
public class Solution_172 {
	/*�൱�ڼ������г�������5�ĸ���*/
	/*����������n������ֵ�ĸ�����������ͬ*/
	public int trailingZeroes(int n) {
		return n==0?0:n/5+trailingZeroes(n/5);
	}

}
