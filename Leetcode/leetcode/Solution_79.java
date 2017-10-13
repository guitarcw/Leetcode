package leetcode;
//ward Search 
public class Solution_79 {
	public boolean exist(char[][] board,String word) {
		boolean[][] bools=new boolean[board.length][board[0].length];
		 for(int i = 0; i < board.length; i++){
	            for(int j = 0; j < board[i].length; j++){
	                if((word.charAt(0) == board[i][j]) && ifExist(bools, board, i, j, 0, word)){
	                    return true;
	                }
	            }
	        }
	        
	        return false;
		
	}
	public boolean ifExist(boolean[][] bools,char[][] board,int row,int col,int index,String word) {
		if(index==word.length()) return true;
		if(row<0||col<0||row>=board.length||col>=board[0].length) return false;
		if(!bools[row][col]&&board[row][col]==word.charAt(index)) {
		bools[row][col]=true;//boolean数组默认为false
		boolean k= ifExist(bools, board, row-1, col, index+1, word)||ifExist(bools, board, row, col-1, index+1, word)||ifExist(bools, board, row+1, col, index+1, word)||ifExist(bools, board, row, col+1, index+1, word);
		if(k) return true;
		bools[row][col]=false;
		}
		return false;
	}

}
