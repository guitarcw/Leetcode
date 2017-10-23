package leetcode;
//Symmetric Tree
public class Solution_101 {
	public boolean isSymmetric(TreeNode root) {
		if(root==null) return true;
		else return isTrue(root.left,root.right);
	}
	public boolean isTrue(TreeNode left,TreeNode right) {
		if(left==null&&right==null) return true;
		if(left!=null&&right!=null&&left.val==right.val) {
			return isTrue(left.left,right.right)&&isTrue(left.right,right.left);
		}
		return false;
	}

}
