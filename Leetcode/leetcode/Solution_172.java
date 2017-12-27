package leetcode;
//172.factorial Trailing zeroes
public class Solution_172 {
	/*相当于计算所有乘数，中5的个数*/
	/*其他的类似n！中数值的个数，方法相同*/
	public int trailingZeroes(int n) {
		return n==0?0:n/5+trailingZeroes(n/5);
	}

}
