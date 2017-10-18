package leetcode;
//Reverse Linked List ||
public class Solution_92 {
	public ListNode reverseBetween(ListNode head,int m,int n) {//原先考虑前后交换，存在问题，交换第一个以后，在交换的方式与原先的想法违背。
		ListNode newHead=new ListNode(0);//最后参考其他人的插入方法
		newHead.next=head;
		ListNode pre=newHead;
		for(int i=0;i<m;i++) {
			pre=pre.next;
		}
		ListNode start=pre.next;//这里添加一步可以
		ListNode insert=start.next;
		for(int i=0;i<n-m;i++) {//插入过程需要仔细考虑步骤
			start.next=insert.next;
			insert.next=pre.next;
			pre.next=insert;
			insert=start.next;
		}
		return newHead.next;
	}

}
