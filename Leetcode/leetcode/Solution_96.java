package leetcode;
//Unique Binary Search Trees
public class Solution_96 {
	public int numTrees(int n) {
		if(n==0) return 0;
		int[] result=new int[n+1];
		result[0]=1;
		for(int len=1;len<=n;len++) {
			int sum=0;
			for(int i=0;i<len;i++) {
				sum+=result[i]*result[len-i-1];
			}
			result[len]=sum;
		}
		return result[n];
	}

}
