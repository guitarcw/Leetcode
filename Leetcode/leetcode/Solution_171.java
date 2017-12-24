package leetcode;
//171. Excel Sheet Column Number
public class Solution_171 {
	public int titleToNumber(String s) {
		char[] x=s.toCharArray();
		int len=s.length();
		int result=0;
		int e=0;
		for(int i=len-1;i>=0;i--) {
			result=(int) (result+Math.pow(26, e)*((x[i]-64)));
            e++;
		}
		return result;
	}

}
