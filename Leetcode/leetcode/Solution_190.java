package leetcode;
//190.Reverse Bits
public class Solution_190 {
	public int reverseBits(int n) { //unsigned 与 integer 的区别理解清楚：unsigned 类型相当于最高位不考虑
		int result=0;
		for(int i=0;i<32;i++) {
			result+=n&1;
			n>>>=1;
			if(i<31)  result<<=1;
		}
		return result;
	}

}
