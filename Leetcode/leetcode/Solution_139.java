package leetcode;

import java.util.List;

//word break;
public class Solution_139 {
	//����ԭ������ʱ�䳬ʱ
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
		boolean[] result =new boolean[s.length()+1];//DP �ؼ�����ǰ����Ľ�����棬������ڵ���
		result[0]=true;
		for(int i=1;i<=s.length();i++) {
			for(int j=i-1;j>=0;j--) {//���ǵ������ǣ�˳��ΪʲôҪ��0��ʼ��
				if(result[j]&&wordDict.contains(s.substring(j, i))) {
					result[i]=true;
					break;
				}
			}
		}
		return result[s.length()];
	}
	

}
