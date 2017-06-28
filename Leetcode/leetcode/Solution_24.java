package leetcode;
/* Given a linked list, swap every two adjacent nodes and return its head. */
public class Solution_24 {
	public ListNode swapPairs(ListNode head){
		if(head==null||head.next==null) return head;
		head.next.next=swapPairs(head.next.next);
		ListNode tmp=head.next;
		head.next=head.next.next;
		tmp.next=head;
		return tmp;
	}

}
