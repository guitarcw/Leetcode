package leetcode;
//Maximum Depth of Binary Tree
public class Solution_104 {
public int maxDepth(TreeNode root) {
	if(root==null)
		return 0;
	else return Math.max(1+maxDepth(root.left),1+maxDepth(root.right));
        
    }

}
