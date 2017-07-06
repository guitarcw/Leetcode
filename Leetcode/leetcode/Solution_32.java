package leetcode;

import java.util.LinkedList;

public class Solution_32 {
	public int longestValiParentheses(String s){
		int max=0;
		int left=-1;
		LinkedList<Integer> comp=new LinkedList<>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='(') comp.push(i);
			else{
				if(comp.isEmpty()) left=i;
				else{
					comp.pop();
					if(comp.isEmpty()) max=Math.max(max, i-left);
					else max=Math.max(max, i-comp.peek());
				}
			}
		}
		return max;
	}
}
