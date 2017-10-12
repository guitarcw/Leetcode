package leetcode;

import java.util.LinkedList;
import java.util.List;

//simplify Path
public class Solution_71 {
	public String simplifyPath(String path) {
		String[] index=path.split("/");
		List<String> result=new LinkedList<>();
		StringBuilder out=new StringBuilder();
		for (String str : index) {
			if(str.equals("")||str.equals(".")) continue;//java中equals与“==”差别
			if(str.equals("..")) if(result.isEmpty()) continue; 
			else result.remove(result.size()-1);//"&&"使用理解不够深入
			else result.add(str);
			
		}
		for (String str : result) {
			out.append("/");
			out.append(str);
		}
		if(out.length()==0) out.append("/");
		return String.valueOf(out);
		
	}

}
