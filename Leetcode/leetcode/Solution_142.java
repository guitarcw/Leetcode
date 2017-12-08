package leetcode;
//Linked List Cycle II
public class Solution_142 {
	public ListNode detectCycle(ListNode head) {
		if(head==null||head.next==null) return null;
		ListNode one=head;
		ListNode two=head;
		while(two.next!=null&&two.next.next!=null) {
			one=one.next;
			two=two.next.next;
			if(one==two) break;
		}
		if(one!=two ) return null;
		one =head;
		while(one!=head) {
			one=one.next;
			two=two.next;
		}
		return one;
	}

}
