package leetcode;
//201.Bitwise AND of Numbers Range
public class Solution_201 {
	//问题概述为解决找寻共同前缀的问题
	public int rangeBitwiseAnd(int m,int n) {
		int mark=1;
		if(m==0) return 0;
		while(m!=n) {
			m>>=1;
			n>>=1;
			mark<<=1;
		}
		return mark*m;
	}

}
