package leetcode;

import java.util.HashMap;
import java.util.Map;

//copy List with Random Pointer
public class Solution_138 {
	Map<RandomListNode, RandomListNode> map=new HashMap<>();
	public RandomListNode copyRandomList(RandomListNode head) {
		if(head==null) return null;
		
		if(map.containsKey(head)) {
			 return map.get(head);
		}//most important 避免循环出现
		RandomListNode temp=new RandomListNode(head.label);//相当于每个RandomlistNode只执行一次相应的赋值操作
		map.put(head, temp);
		temp.next=copyRandomList(head.next);
		temp.random=copyRandomList(head.random);
		return temp;
	}

}
