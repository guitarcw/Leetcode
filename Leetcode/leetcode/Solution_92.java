package leetcode;
//Reverse Linked List ||
public class Solution_92 {
	public ListNode reverseBetween(ListNode head,int m,int n) {//ԭ�ȿ���ǰ�󽻻����������⣬������һ���Ժ��ڽ����ķ�ʽ��ԭ�ȵ��뷨Υ����
		ListNode newHead=new ListNode(0);//���ο������˵Ĳ��뷽��
		newHead.next=head;
		ListNode pre=newHead;
		for(int i=0;i<m;i++) {
			pre=pre.next;
		}
		ListNode start=pre.next;//�������һ������
		ListNode insert=start.next;
		for(int i=0;i<n-m;i++) {//���������Ҫ��ϸ���ǲ���
			start.next=insert.next;
			insert.next=pre.next;
			pre.next=insert;
			insert=start.next;
		}
		return newHead.next;
	}

}
