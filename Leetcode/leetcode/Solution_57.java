package leetcode;

public class Solution_57 {
	public int lengthOfLastWord(String s) {
		int index=s.length()-1;
		int len=0;
		for(int i=index;i>=0&&s.charAt(i)==' ';i--) index--;
		for(int i=index;i>=0&&s.charAt(i)!=' ';i--) len++;
		return len;
	}

}
