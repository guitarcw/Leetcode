package leetcode;
//Record List
public class Solution_143 {
	//��������̫�࣬ջ������ݹ�˼�벻����
	/*public void recorderList(ListNode head) {
		if(head==null ) return ;
		int length=0;
		ListNode nHead=head;
		ListNode middle=head;
		while(nHead!=null) {
			length++;
			nHead= nHead.next;
		}
		for(int i=1;i<(length/2)+1;i++) {
			middle=middle.next;
		}
		stepRecord(head, middle,length-(length)/2-1);
	}
	public void stepRecord(ListNode head,ListNode middle,int index) {
		if(index<=0) return;
		index--;
		stepRecord(head.next,middle,index);
		ListNode temp=head.next;
		head.next=middle.next;
		middle.next=middle.next.next;
		head.next.next=temp;
	}*/
	//�ο��𰸣��ո�˼άһֱ��������κ��ʵĽ����λ���л��ĵص㡱���ȷ�ת��벿�֣�������������׽����л�
	public void recorderList(ListNode head) {
		if(head==null||head.next==null) return;
		ListNode slow=head;
		ListNode fast=head;
		while(fast.next!=null&&fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		ListNode preMiddle=slow;
		ListNode preCurrent=slow.next;
		while(preCurrent.next!=null) {
			ListNode temp=preCurrent.next;
			preCurrent.next=temp.next;
			temp.next=preMiddle.next;
			preMiddle.next=temp;
		}
		slow=head;
		fast=preMiddle.next;
		while(slow!=preMiddle){
			preMiddle.next=fast.next;
			fast.next=slow.next;
			slow.next=fast;
			slow=fast.next;
			fast=preMiddle.next;
		}
	}

}
