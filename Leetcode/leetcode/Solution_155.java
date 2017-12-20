package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//155.min stack
public class Solution_155 {
	class MinStack{
		private Stack<Integer> min;
		private Stack<Integer> stack;
		public MinStack() {
			min=new Stack<>();
			stack=new Stack<>();
		}
		public void push(int x) {
			stack.push(x);
			if(min.isEmpty()) min.push(x);
			else min.add(Math.min(x, min.peek()));
		}
		public void pop() {
			min.pop();
			stack.pop();
			}
		public int top() {
			return stack.peek();
		}
		public int getMin() {
			return min.peek();
		}
 		
	}

}
