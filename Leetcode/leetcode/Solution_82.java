package leetcode;
//Remove Duplicates from Sorted List ||
public class Solution_82 {
	public ListNode DeleteDuplivates(ListNode head) {//������⣬����
		if(head==null) return head;
		ListNode nHead=new ListNode(0);
		nHead.next=head;
		ListNode current=head;
		ListNode previous=nHead;
		while(current!=null) {
			while(current.next!=null&&current.val==current.next.val) current=current.next;
			if(previous.next==current) previous=previous.next;//��ת ѡ�񴴽�previous �� current
			else previous.next=current.next;
			current=current.next;
		}
		return nHead.next;
		
	}

}
