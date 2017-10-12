package leetcode;
//Set Matrix Zeros
public class Solution_73 {
public void setZeroes(int[][] matrix) {
	int col0=1;
	int rows=matrix.length;
	int cols=matrix[0].length;
	for(int row=0;row<rows;row++) {
		if(matrix[row][0]==0) col0=0;
		for(int col=1;col<cols;col++) {
			if(matrix[row][col]==0) matrix[row][0]=matrix[0][col]=0;
		}
	}
	 for (int i = rows - 1; i >= 0; i--) {
	        for (int j = cols - 1; j >= 1; j--)
	            if (matrix[i][0] == 0 || matrix[0][j] == 0)
	                matrix[i][j] = 0;
	        if (col0 == 0) matrix[i][0] = 0;
	    }
		}
		
	}

