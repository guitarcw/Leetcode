package leetcode;
//141.Linked list Cycle
public class Solution_141 {
	public boolean hasCycle(ListNode head) {
		//�뷨�ݽӽ�������ǰһ������ok��
		if(head==null) return false;
		ListNode one=head;
		ListNode two=head;
		while (two.next!=null&&two.next.next!=null) {//����next���жϵ�������
			one=one.next;
			two=two.next.next;
			if(two==one) return true;
		}
		return false;
	}

}
