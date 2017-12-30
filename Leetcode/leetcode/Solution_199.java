package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//199.Binary Tree Right Side View
public class Solution_199 {
	public List<Integer> rightSideView(TreeNode root){
		List<Integer> result=new ArrayList<>();
		if(root==null) return result;
		LinkedList<TreeNode> stack=new LinkedList<>();
		stack.add(root);
		get(result, stack);
		return result;
		
	}
	public void get(List<Integer> result,LinkedList<TreeNode> stack) {
		if(stack.size()==0) return;
		result.add(stack.getFirst().val);
		int len=stack.size();
		for(int i=0;i<len;i++) {
			TreeNode temp=stack.getFirst();
			if(temp.right!=null) stack.add(temp.right);
			if(temp.left!=null) stack.add(temp.left);
			stack.removeFirst();
		}
		get(result, stack);
	}

}
