package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

//179.largest Number
public class Solution_179 {
	//感想数字与字符都为ASCII码，两者之间各有优缺点。有时候数值相关的问题可以借用字符解决
	public String largestNumber(int[] nums) {
		if(nums==null||nums.length==0) return "0";
		ArrayList<String> strs=new ArrayList<>();
		for (int i : nums) {
			strs.add(String.valueOf(i));
		}
		Comparator<String> com=new Comparator<String>() {
			
			@Override
			public int compare(String str1, String str2) {
				// TODO Auto-generated method stub
				
				return (str2+str1).compareTo(str1+str2);
			}
		};
		strs.sort(com);
		if(strs.get(0).charAt(0)=='0') return "0";
		StringBuilder result=new StringBuilder();
		for (String str : strs) {
			result.append(str);
		}
		return result.toString(); //StringBuilder 最后记得转化为String类型
	}
	

}
