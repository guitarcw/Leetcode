package leetcode;

import java.util.LinkedList;
import java.util.Queue;

//population Next Right Pointers in Each Node
public class Solution_116 {
	public void connect (TreeLinkNode root) {
	Queue<TreeLinkNode> queue=new LinkedList<>();
	if(root==null) return ;
	queue.add(root);
	while(!queue.isEmpty()) {
		int size=queue.size();
		for(int i=0;i<size;i++) {
			TreeLinkNode temp=queue.poll();
			if(temp.left!=null) queue.add(temp.left);
			if(temp.right!=null) queue.add(temp.right);
			if(i==size-1)  temp.next=null;
			else temp.next=queue.peek();
			
		}
		
	}
	}

}
