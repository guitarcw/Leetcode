package leetcode;
//考虑使用回溯法
public class Solution_64 {
	public int minPathSum(int[][] grid) {
		if(grid==null||grid.length==0) return 0;
		int cols=grid.length;
		int rows=grid[0].length;
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				if(i==0&&j==0) ;
				else if(i==0) grid[i][j]=grid[i][j]+grid[i][j-1];
				else if(j==0) grid[i][j]=grid[i][j]+grid[i-1][j];
				else grid[i][j]=Math.min(grid[i-1][j], grid[i][j-1])+grid[i][j];
			}
		}
		return grid[cols-1][rows-1];
	}

}
