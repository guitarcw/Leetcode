package leetcode;
//151.Reverse Words in a String
public class Solution_151 {//split����������̣�����Ĳ���Ϊ������ʽ��������Ҫ�õ��ܶ�ת��
	public String reverseWords(String s) {
		if (s==null||s.equals("")) return s;
		String[] strs=s.split(" ");
		StringBuilder result=new StringBuilder();
		if(strs.length==0) return "";
		result.append(strs[strs.length-1]);
		for(int i=strs.length-2;i>=0;i--) {
			if(strs[i].equals(" ")) continue;
				result.append(" ");
				result.append(strs[i]);
		}
		return result.toString();
	}
}
