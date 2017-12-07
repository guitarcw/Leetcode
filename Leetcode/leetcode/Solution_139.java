package leetcode;

import java.util.List;

//word break;
public class Solution_139 {
	//出错原因，运行时间超时
	/*public boolean wordBreak(String s,List<String> wordDict) {
		return Break(s, 0, wordDict);
	}
	public boolean Break(String s,int index,List<String> wordDict) {
		boolean result=false;
		if(index==s.length()) return true;
		for (String string : wordDict) {
			if(index+string.length()<=s.length())
			  if(s.substring(index, index+string.length()).equals(string)) {
				  result=result||Break(s, index+string.length(), wordDict);
			  }
		}
		return result;
	}*/
	public boolean wordBreak(String s,List<String> wordDict) {
		boolean[] result =new boolean[s.length()+1];//DP 关键将以前计算的结果保存，方便后期调用
		result[0]=true;
		for(int i=1;i<=s.length();i++) {
			for(int j=i-1;j>=0;j--) {//考虑的问题是，顺序为什么要从0开始，
				if(result[j]&&wordDict.contains(s.substring(j, i))) {
					result[i]=true;
					break;
				}
			}
		}
		return result[s.length()];
	}
	

}
