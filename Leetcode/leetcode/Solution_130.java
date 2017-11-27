package leetcode;
// Surrounded Regions
// row ÐÐ£»column ÁÐ£»
public class Solution_130 {
	public void solve(char[][] board) {
		if(board==null||board.length==0) return;
		int rows=board.length;
		int columns=board[0].length;
		for (int i = 0; i < rows; i++) {
			stepSolve(board, i, 0);
			if(columns>1) stepSolve(board, i, columns-1);
		}
		for(int i=1;i+1<columns;i++) {
			stepSolve(board, 0, i);
			if(rows>1) stepSolve(board, rows-1, i);
		}
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				if(board[i][j]=='O')
					board[i][j]='X';
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				if(board[i][j]=='1')
					board[i][j]='O';
		
		}
		
	
	public void stepSolve(char[][] board,int row,int column) {
//		if(row<0||row>board.length||column<0||column>board[0].length) return false;
//		if(board[row][column]=='x') return true;
//		else 
//			if()
//				return stepSolve(board, row-1, column)&&stepSolve(board, row+1, column)&&
//				stepSolve(board, row, column-1)&&stepSolve(board, row, column+1);
		if(board[row][column]=='O') {
			board[row][column]='1';
			if(row>1) stepSolve(board, row-1, column);
			if(column>1) stepSolve(board, row, column-1);
			if(row+1<board.length) stepSolve(board, row+1, column);
			if(column+1<board[0].length) stepSolve(board, row, column+1);
		
	}

}
}
