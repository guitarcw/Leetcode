package leetcode;
//212.Word Search ||

import java.util.ArrayList;
import java.util.List;
//��Ŀ�������Ѿ����ʵĵ㻹���Լ���
public class Solution_212 {
	public static List<String> findWords(char[][] board,String[] words){
		List<String> result=new ArrayList<>();
		if(board==null) return result;
		int cols=board.length;
		int rows=board[0].length;
		for (String string : words) {
			char[] chars=string.toCharArray();
			boolean[][] bool=new boolean[cols][rows];
			for(int i=0;i<cols;i++) {
				if(result.contains(string)) break;
				for(int j=0;j<rows;j++) {
					if(board[i][j]==chars[0]) {
						if(helper(board, bool, chars, 0, i, j)) {
							result.add(string);
							break;
						}
					}
				}
			}
		}
		return result;
	}
	private static boolean helper(char[][] board,boolean[][] bool,char[] word,int index,int col,int row) {
		if(index==word.length) return true;
		if(0<=col&&0<=row&&col<board.length&&row<board[0].length) { //�жϹ�����ȱʧ���ڵ���0
			if(board[col][row]==word[index]&&!bool[col][row]) {
				bool[col][row]=true;
				boolean k= helper(board, bool, word, index+1, col-1, row)||
					   helper(board, bool, word, index+1, col+1, row)||
					   helper(board, bool, word, index+1, col, row-1)||
					   helper(board, bool, word, index+1, col, row+1)||
					   helper(board, bool, word, index+1, col, row);
				bool[col][row]=false;
				return k;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		char[][] board= {{'a','a'}};
		String[] words= {"aa","oath","pea","eat","rain"};
		List<String> k=findWords(board, words);
		System.out.println(k);
	}

}
