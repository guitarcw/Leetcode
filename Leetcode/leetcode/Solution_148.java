package leetcode;
//Sort List
public class Solution_148 {
	//˼�������� ��ͨ���򷽷��еĹ鲢�����˼�룬�鲢��˼����Ҫ�Ƿ��Σ��Ѵ����⻮��
	//ΪС���⣬Ȼ����������
	public ListNode sortList(ListNode head) {
		if(head==null||head.next==null) return head;
		ListNode fast=head;
		ListNode slow=head;
		while(fast.next!=null&&fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		ListNode ne=slow.next;
		slow.next=null;
		ListNode l1=sortList(head);
		ListNode l2=sortList(ne);
		return merge(l1,l2);
	}
	public ListNode merge(ListNode l1,ListNode l2) {
		ListNode h1=new ListNode(0);
		ListNode h2=h1;
		h1.next=l1;h2.next=l2;
		while(l1!=null&&l2!=null) {
			if(l1.val<l2.val) {
				h1.next=l1;
				l1=l1.next;
			}
			else {
				h1.next=l2;
				l2=l2.next;
			}
			h1=h1.next;
		}
		if(l1!=null)
			h1.next=l1;
		if(l2!=null)
			h1.next=l2;
		return h2.next;
		
		
		
	}

}
