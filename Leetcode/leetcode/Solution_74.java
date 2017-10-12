package leetcode;
//search a 2D Matrix
public class Solution_74 {
public boolean searchMatrix(int[][] matrix,int target) {
	int rows=matrix.length;
	if(rows==0) return false;
	int cols=matrix[0].length;
	if(cols==0) return false;
	int row=0;
	while(row<=rows-1) {
		if(matrix[row][cols-1]>=target)
			return twoSearch(matrix, target, row);
		else row++;
	}
	return false;
}
public boolean twoSearch(int[][] matrix,int target,int row) {
	int cols=matrix[0].length;
	int start=0;
	int end=cols-1;
	while(start<=end) {
	int mid=(start+end)/2;
	if(matrix[row][mid]==target)
		return true;
	else if(matrix[row][mid]<target)
		start=mid+1;
	else end=mid-1;
	}
	return false;
}
}
