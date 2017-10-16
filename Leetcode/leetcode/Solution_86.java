package leetcode;
//Partition List
public class Solution_86 {
	public ListNode partition(ListNode head,int x) {
		if(head==null) return head;
		ListNode newHead=new ListNode(0);
		ListNode current=newHead;
		newHead.next=head;
		ListNode end=head;
		int length=0;
		while(end.next!=null) {
			end=end.next;
			length++;
		}
		for(int i=0;i<=length;i++){
			if(current.next.val<x) current=current.next;
			else {
				end.next=current.next;
				current.next=current.next.next;
				end.next.next=null;
				end=end.next;
			}
		}
		return newHead.next;
	}

}
