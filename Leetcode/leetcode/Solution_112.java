package leetcode;
//Path Sum
public class Solution_112 {
	public boolean hasPathSum( TreeNode root ,int sum) {//�ѵ㣺��Ҫ�жϵ��ǵ������Ҷ�ڵ�
		 if(root==null) return false;
		 if(root.val==sum&&root.left==null&&root.right==null) return true;
		 return hasPathSum(root.left, sum-root.val)||hasPathSum(root.right, sum-root.val);
	}

}
