package leetcode;

public class Solution_61 {
	public ListNode rotateRight(ListNode head,int k) {
		if(head==null||head.next==null) return head;
		ListNode newHead=new ListNode(0);
		newHead.next=head;
		ListNode com=newHead;
		ListNode temp=newHead;
		int size=0;
		while(com.next!=null) {size++;com=com.next;}
		for(int i=0;i<size-k%size;i++) {
			temp=temp.next;
		}
		com.next=newHead.next;
		newHead.next=temp.next;
		temp.next=null;
		return newHead.next;
	}

}
