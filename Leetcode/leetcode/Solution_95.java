package leetcode;

import java.util.ArrayList;
import java.util.List;

//Unique Binary Search Trees ||
public class Solution_95 {
	public List<TreeNode> generateTrees(int n){//Dp算法并且实现过程存在技巧性，重点考虑过程中的特点
		List<TreeNode>[] result=new List[n+1];//开始的想法欠缺全面性，后面考虑拆表然后再添加，过程过于复杂，以后类似问题考虑存储中间结果
		result[0]=new ArrayList<TreeNode>();
		if(n==0) return result[0];
		result[0].add(null);
		for(int len=1;len<=n;len++) {
			result[len]=new ArrayList<>();
			for(int i=0;i<len;i++) {
				for(TreeNode left:result[i]) {
					for(TreeNode right:result[len-i-1]) {
						TreeNode head=new TreeNode(i+1);
						head.left=left;
						head.right=clone(right,i+1);
						result[len].add(head);
					}
				}
			}
			
			
		}
		return result[n];
	}
	public TreeNode clone(TreeNode h,int m) {
		if(h==null) return null;
		TreeNode newH=new TreeNode(h.val+m);
		newH.left=clone(h.left,m);
		newH.right=clone(h.right,m);
		return newH;
	}
	

}
