package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_49 {
	public List<List<String>> groupAnagrams(String[] strs){
		List<List<String>> list=new ArrayList<>();
		if(strs==null||strs.length==0) return list;
		Map<String, List<String>> map=new HashMap<>();
		for(int i=0;i<strs.length;i++) {
			char[] curr=strs[i].toCharArray();
			Arrays.sort(curr);
			String str=String.valueOf(curr);
			if(!map.containsKey(str)) map.put(str, new ArrayList<>());
			map.get(str).add(strs[i]);
			}
		return new ArrayList<List<String>>(map.values());
		}
	}

