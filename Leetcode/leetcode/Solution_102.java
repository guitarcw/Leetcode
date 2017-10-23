package leetcode;
//Binary Tree Level Order Traversal

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution_102 {
	public List<List<Integer>> levelOrder(TreeNode root){//巧妙使用数据类型，queue
		Queue<TreeNode> queue=new LinkedList<>();
		List<List<Integer>> result=new LinkedList<>();
		if(root==null) return result;
		queue.add(root);
		while(!queue.isEmpty()) {
			int size=queue.size();
			List<Integer> temp=new LinkedList<>();
			for(int i=0;i<size;i++) {
				if(queue.peek().left!=null) queue.add(queue.peek().left);
				if(queue.peek().right!=null) queue.add(queue.peek().right);
				temp.add(queue.poll().val);
			}
			result.add(temp);
		}
		return result;
	}

}
