package leetcode;
//187.Repeated DNA Sequences

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution_187 {
	public List<String> findRepeatedDnaSequences(String s){
		Map<String, Integer> map=new HashMap<>();
		List<String> result=new ArrayList<>();
		if(s==null||s.length()<=10) return result;
		
		for(int i=0;i<=s.length()-10;i++) {
			String str=s.substring(i, i+10);
			if(map.containsKey(str)) 
				map.put(str, map.get(str)+1);
			else 
				map.put(str, 1);
		}
		Set<String> set=map.keySet();
		for (String str : set) {
			if(map.get(str)>1) result.add(str);
		}
		return result;
	}

}
