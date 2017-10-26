package leetcode;
//Binary Tree Level Order Traversal ||

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Solution_107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root){
		
		List<List<Integer>> result=new LinkedList<>();
		if(root==null) return result;
		Queue<TreeNode> stack=new LinkedList<>();
		stack.add(root);
		while(!stack.isEmpty()) {
			List<Integer> temp=new ArrayList<Integer>();
			int size=stack.size();
			while(size--!=0) {
				if(stack.peek().left!=null) stack.add(stack.peek().left);
				if(stack.peek().right!=null) stack.add(stack.peek().right);
				temp.add(stack.poll().val);
				
			}
			result.add(temp);
		}
		Collections.reverse(result);
		return result;
	}

}
