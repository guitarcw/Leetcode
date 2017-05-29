package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution_3 {
	public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int i=0,j=0,ants=0;
        while (i<s.length()&&j<s.length()) {
			if (!set.contains(s.charAt(i))) {
				set.add(s.charAt(i++));
				ants=Math.max(ants, i-j);
			} else {
				set.remove(s.charAt(j++));

			}
		}
        return ants;
    }

}
