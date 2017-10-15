package leetcode;
//Remove Duplicates from Sorted List
public class Solution_83 {
	public ListNode deleteDuplicates(ListNode head) {//与上题类似，需要加深对引用的的理解，另外需要关注引用的切换
		if(head==null) return head;
		ListNode fHead=new ListNode(0);
		fHead.next=head;
		ListNode current=head;
		while(current!=null) {
		   while(current.next!=null&&current.val==current.next.val)
			   current=current.next;
		   if(head!=current) head.next=current.next;
		 head=current=head.next;
		   
		}
		return fHead.next;
	}

}
