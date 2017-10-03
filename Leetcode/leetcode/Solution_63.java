package leetcode;

public class Solution_63 {
	public int uniquePathsWithObstacle(int[][] obstacleGrid) {
		if(obstacleGrid.length==0) return 0;
		int cols=obstacleGrid.length;
		int rows=obstacleGrid[0].length;
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				if(obstacleGrid[i][j]==1) obstacleGrid[i][j]=0;
				else if(i==0&j==0) obstacleGrid[i][j]=1;
				else if(i==0) obstacleGrid[i][j]=obstacleGrid[i][j-1];
				else if(j==0) obstacleGrid[i][j]=obstacleGrid[i-1][j];
				else obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
				
			}
		}
		return obstacleGrid[cols-1][rows-1];
	}

}
