package leetcode;
//222.count complete tree Nodes
public class Solution_222 {
	//Time Limit Exceeded
	/*public int countNodes(TreeNode root) {
		if(root==null) return 0;
		return countNodes(root.left)+countNodes(root.right)+1;
	}*/
	//重点左右分支的点个数是存在规律的，即除去最后一层其他层都是满的
	public int countNodes(TreeNode root) {
		 int h=getHeight(root);
		 return h==-1?0:getHeight(root.right)==h-1?(1<<h)+countNodes(root.right):
			 (1<<h-1)+countNodes(root.left);
	}
	public int getHeight(TreeNode root)
	{
		return root==null?-1:1+getHeight(root.left);
	}
}
