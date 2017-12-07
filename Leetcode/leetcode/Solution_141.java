package leetcode;
//141.Linked list Cycle
public class Solution_141 {
	public boolean hasCycle(ListNode head) {
		//想法狠接近，再往前一步，就ok啦
		if(head==null) return false;
		ListNode one=head;
		ListNode two=head;
		while (two.next!=null&&two.next.next!=null) {//两个next，判断得由两次
			one=one.next;
			two=two.next.next;
			if(two==one) return true;
		}
		return false;
	}

}
