package leetcode;
//206.Reverse Linked List
public class Solution_206 {
//˼ά�ܵ������ԣ�shit
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
