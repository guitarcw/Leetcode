package leetcode;
//Minimum Depth of Binary Tree
public class Solution_111 {
	public int minDepth(TreeNode root) {
		if(root==null) return 0;
		if(root.left==null&&root.right!=null) return 1+minDepth(root.right);
		else if(root.left!=null&& root.right==null) return 1+minDepth(root.left);
		else return 1+Math.min(minDepth(root.left), minDepth(root.right));
	}

}
