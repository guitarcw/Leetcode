package leetcode;
//Balanced Binary Tree
public class Solution_110 {
	public boolean isBalanced(TreeNode root) {
		if(root==null) return true;
		return Math.abs(getDepth(root.left)-getDepth(root.right))<=1&&isBalanced(root.left)&&isBalanced(root.right);
		
	}
	public int getDepth(TreeNode root) {
		if(root==null) return 0;
		return 1+Math.max(getDepth(root.left), getDepth(root.right));
	}

}
