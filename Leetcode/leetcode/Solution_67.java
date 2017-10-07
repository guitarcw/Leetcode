package leetcode;
// Add Binary
public class Solution_67 {
	public String addBinaty(String a,String b) {
		StringBuilder result=new StringBuilder();
		int lena=a.length()-1;
		int lenb=b.length()-1;
		int sum=0;
		int carry=0;
		while(lena>=0||lenb>=0) {
			sum=carry;
			if(lena>=0) sum+=a.charAt(lena--)-'0';
			if(lenb>=0) sum+=b.charAt(lenb--)-'0';
			result.append(sum%2);
			carry=sum/2;
		}
		if(carry!=0) result.append(carry);
		result.reverse();
		return String.valueOf(result);
		
	}

}
