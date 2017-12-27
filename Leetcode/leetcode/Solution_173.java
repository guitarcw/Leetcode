package leetcode;

import java.util.LinkedList;

//173.Binary Search  Tree Iterator
public class Solution_173 {
	 class BSTIterator {
		 LinkedList<TreeNode> stack=new LinkedList<>();

	     public  BSTIterator(TreeNode root) {
	        pushTreeNode(root);
	    }

	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        return !stack.isEmpty();
	    }

	    /** @return the next smallest number */
	    public int next() {
	        TreeNode result=stack.pop();
	        pushTreeNode(result.right);
	        return result.val;
	    }
	    public void pushTreeNode(TreeNode node) {
	    	while(node!=null)
	    	{
	    		stack.push(node);
	    		node=node.left;
	    	}
	    }
	 }

}
