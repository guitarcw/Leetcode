package leetcode;
//Remove Duplicates from Sorted List
public class Solution_83 {
	public ListNode deleteDuplicates(ListNode head) {//���������ƣ���Ҫ��������õĵ���⣬������Ҫ��ע���õ��л�
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
