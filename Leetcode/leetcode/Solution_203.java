package leetcode;
//203.remove Linked list Elements
public class Solution_203 {
	public ListNode removeElements(ListNode head,int val) {
		if(head==null) return null; 
		ListNode newHead=new ListNode(0);
		ListNode pre=newHead;
		ListNode curr=head;
		newHead.next=head;
		while(curr!=null) {
			if(curr.val==val) {
				pre.next=pre.next.next;
				curr=pre.next;
			}
			else 
			{
			pre=pre.next;
			curr=curr.next;}
		}
		return newHead.next;
		
		
	}

}
