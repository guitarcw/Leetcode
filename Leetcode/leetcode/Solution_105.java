package leetcode;
//Contruct Binary Tree from Preorder and inorder Traversal
public class Solution_105 {
	public TreeNode bulidTree( int[] preorder,int[] inorder) {
		int len=preorder.length-1;
		if(len<0) return null;
		return stepTree(preorder, 0, len, inorder, 0, len);
		
	}
	public TreeNode stepTree(int[] preorder,int m,int n,int[] inorder,int i,int j) {
		if(m>n) return null;
		int index = i;
		TreeNode root=new TreeNode(preorder[m]);
		while(preorder[m]!=inorder[index]) index++;
		int num=index-i;
		root.left=stepTree(preorder, m+1, m+num, inorder, i, index-1);
		root.right=stepTree(preorder, m+num+1, n, inorder, index+1, j);
		return root;
		
	}

}
