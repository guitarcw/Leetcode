package leetcode;

import java.util.HashSet;
import java.util.Set;

//202.Happpy Number
public class Solution_202 {
	public boolean isHappy(int n) {
		
		int next=0;
		Set<Integer> set=new HashSet<>();
		set.add(n);
		while(!set.contains(next)) {
			set.add(next);
			next=0;
			while(n!=0) {
				next+=Math.pow(n%10, 2);
				n=n/10;
			}
			if(next==1) return true;
			n=next;
			}
		return false;
		}

}
