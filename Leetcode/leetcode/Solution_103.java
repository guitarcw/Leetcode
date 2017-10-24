package leetcode;
// Binary Tree Zigzag Level Order Traversal

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution_103 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root){
		TreeNode c=root;
		   List<List<Integer>> ans =new ArrayList<>();
		   //原先效仿*103,使用一个堆栈时，循环不会停止，
		   //原因是里面永远掺杂Left与Right非全null的点
		   if(c==null) return ans;
		   Stack<TreeNode> s1=new Stack<TreeNode>();
		   Stack<TreeNode> s2=new Stack<TreeNode>();
		   s1.push(root);
		   while(!s1.isEmpty()||!s2.isEmpty())
		   {
		       List<Integer> tmp=new ArrayList<Integer>();
		        while(!s1.isEmpty())
		        {
		            c=s1.pop();
		            tmp.add(c.val);
		            if(c.left!=null) s2.push(c.left);
		            if(c.right!=null) s2.push(c.right);
		        }
		        ans.add(tmp);
		        tmp=new ArrayList<Integer>();
		        while(!s2.isEmpty())
		        {
		            c=s2.pop();
		            tmp.add(c.val);
		            if(c.right!=null)s1.push(c.right);
		            if(c.left!=null)s1.push(c.left);
		        }
		        if(!tmp.isEmpty()) ans.add(tmp);
		   }
		   return ans;
	}
}
