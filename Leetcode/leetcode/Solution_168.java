package leetcode;
//168. Excel Sheet Column Title
public class Solution_168 {
	public String convertToTitle(int n) {
		StringBuilder result =new StringBuilder();
		while(n>26) {
			int m=n%26;
			if(m==0) {         //��Ϊ�Ǵ�1 ��ʼ�����Ա������
				result.append((char)(1+64));
				n=n/26-1;
				continue;
			}
			result.append((char)(m+64));
			n=(n-1)/26;
		}
		result.append((char)(n+64));
		return result.reverse().toString();
	}
//���˵ķ���ԭ����ͬ�������̸��Ӽ��
/*	public class Solution {
	    public String convertToTitle(int n) {
	        StringBuilder result = new StringBuilder();

	        while(n>0){
	            n--;
	            result.insert(0, (char)('A' + n % 26));
	            n /= 26;
	        }

	        return result.toString();
	    }*/

}
