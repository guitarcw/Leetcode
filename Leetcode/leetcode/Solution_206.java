package leetcode;
//206.Reverse Linked List
public class Solution_206 {
//思维受到局限性，shit
	public ListNode reverseList(ListNode head) {
		ListNode curr=head;
		ListNode pre=null;
		while(curr!=null) {
			ListNode temp=curr.next;
			curr.next=pre;
			pre=curr;
			curr=temp;
		}
		return pre;
	}

}
