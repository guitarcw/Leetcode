package leetcode;
/*Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses. 
 * 思路：通过数值来实现左右括号数*/
import java.util.LinkedList;
import java.util.List;

public class Solution_22 {
	public List<String> generateParenthesis(int n){
		List<String> out=new LinkedList<>();
		merge(out, "", 0,0, n);
		return out;
		
	}
	public void merge(List<String> list,String str,int start,int end,int n){
		if(str.length()==n*2) {list.add(str);return;}
		if(start<n)
		merge(list, str+"(",start+1,end, n);
		if(end<start)
		merge(list, str+")", start,end+1, n);
	}

}
