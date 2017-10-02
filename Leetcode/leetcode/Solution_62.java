package leetcode;

public class Solution_62 {
	 /*public int uniquePaths(int m,int n) {
			if(m<=0||n<=0) return 0;
			return getSum(m, n, 1, 1);
			
		}
		public int getSum(int m,int n,int down,int right) {
			if(down<m&&right<n) return getSum(m, n, down+1, right)+getSum(m, n, down, right+1);
			return 1;
		}
	*///方法可行，耗时过长
	public int uniquePaths(int m,int n) {
		  Integer[][] map = new Integer[m][n];
	        for(int i = 0; i<m;i++){
	            map[i][0] = 1;
	        }
	        for(int j= 0;j<n;j++){
	            map[0][j]=1;
	        }
	        for(int i = 1;i<m;i++){
	            for(int j = 1;j<n;j++){
	                map[i][j] = map[i-1][j]+map[i][j-1];
	            }
	        }
	        return map[m-1][n-1]; //动态规划解决问题
		
	}

}
