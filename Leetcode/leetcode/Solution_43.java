package leetcode;

public class Solution_43 {
	public String multiply(String num1,String num2) {
		int one=num1.length(); int two=num2.length();
		int[] result=new int[one+two];
		for(int i=one-1;i>=0;i--) {
			for(int j=two-1;j>=0;j--) {
				int sum=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
				int p1=i+j;int p2=i+j+1;
				sum+=result[p2];
				result[p1]+=sum/10;
				result[p2]=sum%10;
			}
			
		}
		StringBuffer st=new StringBuffer();
		for(int p:result) 
			if(!(st.length()==0&&p==0)) st.append(p);
		return st.length()==0?"0":st.toString();
	}

}
