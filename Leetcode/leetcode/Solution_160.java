package leetcode;

public class Solution_160 {
	public ListNode getIntersectionNode(ListNode headA,ListNode headB) {
		int lenA=0,lenB=0;
		ListNode nHeadA=headA;
		ListNode nHeadB=headB;
		while(nHeadA!=null) {
			lenA++;
			nHeadA=nHeadA.next;
		}
		while(nHeadB!=null) {
			lenB++;
			nHeadB=nHeadB.next;
		}
		while(lenB>lenA&&headB!=null) {
			headB=headB.next;
			lenB--;
		}
		while(lenB<lenA&&headA!=null) {
			headA=headA.next;
			lenA--;
		}
		while(headA!=null&&headB!=null) {
			if(headA==headB) return headA;
			headA=headA.next;
			headB=headB.next;
		}
		return null;
		
	}

}
