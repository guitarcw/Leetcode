package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_131 {
	List<List<String>> result=new ArrayList<>();
	List<String> current=new ArrayList<>();
	public List<List<String>> partition(String s){
		if(s.length()==0||s==null) return result;
		backTrack(s, 0);
		return result;
		
	}
	public void backTrack(String s,int l) {
		if(l>=s.length()) result.add(new ArrayList<>(current));
		for (int i = l; i < s.length(); i++) {
			if(isPalindrome(s, l, i)) {
				current.add(s.substring(l, i+1));//"hamburger".substring(4, 8) returns "urge
				backTrack(s, i+1);
				current.remove(current.size()-1);
			}
		}
		
	}
	public boolean isPalindrome(String str,int l,int r) {
		if(l==r) return true;
		else 
			while(l<=r) if(str.charAt(l)==str.charAt(r)) {
				l++;r--;
			}
			else return false;
		return true;
	}

}
