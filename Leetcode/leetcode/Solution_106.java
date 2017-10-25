package leetcode;
//Construct Binary Tree from inorder and Postorder Traversal
public class Solution_106 {
	public TreeNode buildTree(int[] inorder,int[] postorder) {
		int len=postorder.length-1;
		if(len<0) return null;
		return stepTree(inorder, 0, len, postorder, 0, len);
	}
	public TreeNode stepTree(int[] inorder,int m,int n,int[] postorder ,int i,int j) {
		if(i>j) return null;
		int index=n;
		TreeNode root=new TreeNode(postorder[j]);
		while(inorder[index]!=postorder[j]) index--;
		int num=n-index;
		root.right=stepTree(inorder, index+1, n, postorder, j-num, j-1);
		root.left=stepTree(inorder, m, index-1, postorder, i, j-num-1);
		return root;
		
	}

}
