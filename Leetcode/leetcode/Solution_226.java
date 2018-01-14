package leetcode;
//226. Invert Binary Tree
public class Solution_226 {
	public TreeNode invertTree(TreeNode root) {
		if(root==null) return null;
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
