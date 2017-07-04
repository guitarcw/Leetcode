package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution_30 {
public List<Integer> findSubString(String s,String[] words){
	List<Integer> out=new LinkedList<>();
	if(s==null||words.length==0) return out;
	int len=words[0].length();
	Map<String, Integer> map=new HashMap<>();
	for (int i = 0; i < words.length; i++) {
		map.put(words[i], map.containsKey(words[i])?map.get(words[i])+1:1);
	}
	for (int i = 0; i <=s.length()-words.length*len; i++) {
		Map<String, Integer> com=new HashMap<>(map);
		for (int j = 0; j < words.length; j++) {
			String key=s.substring(i+len*j, i+len*j+len);
			if(com.containsKey(key)){
				int count=com.get(key);
				if(count==1) com.remove(key);
				else com.put(key, com.get(key)-1);
				if(com.isEmpty()){
					out.add(i);
					break;
				}
			} else break;
		}
	}
	return out;
	
}
}
