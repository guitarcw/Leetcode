package leetcode;
//Valid Palindrome
public class Solution_125 {
	public boolean isPalindrome(String s) {
		if(s.length()<=0) return true;
		int start=0;int end=s.length()-1;
		while(start<=end) {
			while(start<(s.length()-1)&&!isChar(s.charAt(start))) start++;
			while(end>0&&!isChar(s.charAt(end))) end--;
			if(Character.toLowerCase(s.charAt(start))==Character.toLowerCase(s.charAt(end))) {
				start++;end++;
				continue;
			}
			else return false;
		}
		return true;
	}
	private boolean isChar(char ch) {
		if('a'<=ch&&ch<='Z') return true;
		else return false;
	}

}
