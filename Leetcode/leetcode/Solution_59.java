package leetcode;

public class Solution_59 {
	public int[][] generateMatrix(int n){
		//if(n==0) return null;
				int[][] nums=new int[n][n];
				int k=1;
				for(int i=0;i<(n+1)/2;i++) {
					for(int j=i;j<n-i;j++) nums[i][j]=k++;
					for(int j=i+1;j<n-i;j++) nums[j][n-i]=k++;
					for(int j=n-i-2;j>i;j--) nums[n-i][j]=k++;
					for(int j=n-i-1;j>i+1;j--) nums[j][i]=k++;
				}
				return nums;	}

}
