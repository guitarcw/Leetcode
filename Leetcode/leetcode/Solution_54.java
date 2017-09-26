package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_54 {
	public List<Integer> spiraOrder(int[][] matrix){
	List<Integer> list = new ArrayList<Integer>();
    if (matrix.length == 0) {
        return list;
    }
    int rowBegin = 0;
    int rowEnd = matrix.length-1;
    int colBegin = 0;
    int colEnd = matrix[0].length - 1;
    while(rowBegin<=rowEnd&&colBegin<=colEnd) {
    	for(int i=colBegin;i<=colEnd;i++) {
    		list.add(matrix[rowBegin][i]);
    	}
    	rowBegin++;
    	for(int i=rowBegin;i<=rowEnd;i++) {
    		list.add(matrix[i][colEnd]);
    	}
    	colEnd--;
    	if(rowBegin<=rowEnd) {
    		for(int i=colEnd;i>=colBegin;i--) list.add(matrix[rowEnd][i]);
    		rowEnd--;
    	}
    	if(colBegin<=colEnd) {
    		for(int j=rowEnd;j>=rowBegin;j--) list.add(matrix[j][colBegin]);
    		colBegin++;
    	}
    }
    return list;
	}

}
