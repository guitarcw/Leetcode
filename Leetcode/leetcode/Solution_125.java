package leetcode;
//Valid Palindrome
public class Solution_125 {
	public boolean isPalindrome(String s) {
		if(s.length()<=0) return true;
		int start=0;int end=s.length()-1;
		while(start<=end) {
			while(start<(s.length()-1)&&!Character.isLetterOrDigit(s.charAt(start))) start++;
			while(end>=0&&!Character.isLetterOrDigit(s.charAt(end))) end--;
			if(start>end) return true;
			else if(Character.toLowerCase(s.charAt(start))==Character.toLowerCase(s.charAt(end))) { 
				end--;start++;
				continue;
			}
			else return false;
		}
		return true;
	}
	/*private boolean isChar(char ch) {
		if('a'<=ch&&ch<='Z') return true;
		else return false;
	}*///判断问题，出现错误，主要对Java 字母与Ascii码值对应理解不清楚 。a-z：97-122 A-Z：65-90 0-9：48-57

}
