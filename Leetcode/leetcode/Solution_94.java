package leetcode;

import java.util.ArrayList;
import java.util.List;

//Binary Tree Inorder Traversal
public class Solution_94 {
	public List<Integer> inorderTraversal(TreeNode root){
		
		List<Integer> result=new ArrayList<>();
		if(root==null) return result;
		inorder(result, root);
		return result;
		
	}
	public void inorder(List<Integer> result ,TreeNode root) {
		if(root==null) return;
		inorder(result, root.left);
		result.add(root.val);
		inorder(result, root.right);
	}

}
