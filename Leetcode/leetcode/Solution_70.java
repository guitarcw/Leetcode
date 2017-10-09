package leetcode;
// ckinbing Stairs
public class Solution_70 {
	/*public int climbStairs(int s) {
		if(s<0) return 0;
		if(s==0) return 1;
		return climbStairs(s-2)+climbStairs(s-1);
	}*///递归方法不能满足时间要求
	public int climbStairs(int n) {
		 int[] result=new int[n+1];
		 result[0]=1;
		 result[1]=1;
		 for(int i=2;i<=n;i++)
			 result[i]=result[i-1]+result[i-2];
		 return result[n]	;
	}

}
