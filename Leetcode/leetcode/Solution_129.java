package leetcode;

public class Solution_129 {
public int sumNumbers(TreeNode root) {
        return rootSum(root, 0);
        
    }
public int rootSum(TreeNode node, int sum) {
	if(node==null) return 0;
	if(node.left==null&&node.right==null) return sum*10+node.val;
	return rootSum(node.left, sum*10+node.val)+rootSum(node.right, sum*10+node.val);
	
}

}
