package leetcode;
//200.Number of islands
public class Solution_200 {
	public int numIslands(char[][] grid) {
		if(grid.length==0||grid==null) return 0;
		int rows=grid.length;
		int cols=grid[0].length;
		int result=0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(grid[i][j]=='1') {
					mark(grid, i, j);
					result++;
				}
				
			}
		}
		return result;
	}
	public void mark(char[][] grid,int row,int col) {
		if(grid[row][col]=='1') {
			grid[row][col]='0';
			if(row+1<grid.length) mark(grid, row+1, col);
			if(col+1<grid[0].length) mark(grid, row, col+1);
			if(row-1>=0) mark(grid, row-1, col);
			if(col-1>=0) mark(grid, row, col-1);
		}
	}

}
