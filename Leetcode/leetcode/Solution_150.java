package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//150. Evaluate Reverse Polish Notation
public class Solution_150 {
	public int evalRPN(String[] token) {
		List<String> operators=new ArrayList<String>() ;
		operators.add("+");operators.add("-");operators.add("*");operators.add("/");
		Stack<Integer> stack=new Stack<>();
		for (String str : token) {
			if(operators.contains(str)) {
				stack.push(operation(stack.pop(), stack.pop(), str));
			}
			else {
				stack.push(Integer.parseInt(str));
			}
		}
		return stack.pop();
	}
	public int operation(int l2,int l1,String str) {
		
		if(str.equals("+")) return l1+l2;
		if(str.equals("-")) return l1-l2;
		if(str.equals("*")) return l1*l2;
		if(str.equals("/")) return l1/l2;
		else return 0;
	}

}
