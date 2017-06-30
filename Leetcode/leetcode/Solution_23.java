package leetcode;

public class Solution_23 {
	public ListNode mergeKList(ListNode[] lists){
		return partition(lists,0,lists.length-1);
	}
	public ListNode partition(ListNode[] list,int str,int end){
		if(str==end) return list[str];
		int centre=(end+str)/2;
		ListNode l1=partition(list,str,centre);
		ListNode l2=partition(list,centre+1,end);
		return merge(l1,l2);
		
	}
	public ListNode merge(ListNode one,ListNode two){
		if(one==null) return two;
		if(two==null) return one;
		if(one.val>=two.val){
			two.next=merge(one,two.next);
			return two;
		}else{
			one.next=merge(one.next,two);
			return one;
		}
	}

}
