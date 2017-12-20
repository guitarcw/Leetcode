package test;

import java.util.LinkedList;
import leetcode.Solution_74;
import java.util.List;

public class test {
	//public static String simplifyPath(String path) {
		/*String[] index=path.split("/");
		List<String> result=new LinkedList<>();
		StringBuilder out=new StringBuilder();
		for (String str : index) {
			if(str.equals("")||str.equals(".")) continue;
			if(str.equals("..")) if(result.isEmpty()) continue; else result.remove(result.size()-1);
			else result.add(str);
			
		}
		for (String str : result) {
			out.append("/");
			out.append(str);
		}
		if(out.length()==0) out.append("/");
		return String.valueOf(out);}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=0;
//		int m=n++;
//		int[][] k=new int[1][1];
//		System.out.print(m);
//		System.out.print(n);
		String path="  1";
		String[] str=path.split("");
		for (String string : str) {
			System.out.println(string);
			
		}
		
		
		

	}

}
