package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

//225.Implement Stack using Queues
public class Solution_225 {
	class MyStack {
		private Queue<Integer> queue=new ArrayDeque<>();

	    /** Initialize your data structure here. */
	    public MyStack() {
	       
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	        queue.add(x);
	        for(int i=0;i<queue.size()-1;i++) {
	        	queue.add(queue.poll());
	        }
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {
	        return queue.poll();
	    }
	    
	    /** Get the top element. */
	    public int top() {
	        return queue.peek();
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	        return queue.isEmpty();
	    }
	}

}
