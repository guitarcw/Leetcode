package leetcode;

import java.util.LinkedList;

//Validate Binary Search Tree
public class Solution_98 {
	public boolean isValidBST(TreeNode root) {//����ʹ���������������������Ƚϣ��ұ�����С�Ƚ�
		if(root==null ) return true;
		LinkedList<TreeNode> stack=new LinkedList<>();
		TreeNode pre=null;
		while(root!=null||!stack.isEmpty()) {
			while(root!=null) {
				stack.push(root);
				root=root.left;
				
			}
			root=stack.pop();
			if(pre!=null&&root.val<=pre.val)return false;
			pre=root;
			root=root.right;
		}
		return true;
		
		
	}
}
