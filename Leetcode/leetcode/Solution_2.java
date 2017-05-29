package leetcode;

public class Solution_2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
	        ListNode add=new ListNode(0);
	        ListNode p=add;
	        while(l1!=null||l2!=null||sum!=0){
	            if(l1!=null){
	                sum+=l1.val;
	                l1=l1.next;
	            }
	            if(l2!=null){
	                sum+=l2.val;
	                l2=l2.next;
	            }
	        	add.next=new ListNode(sum%10);
	        	add=add.next;
	        	sum/=10;
	        }
	        return p.next;
   }

}
