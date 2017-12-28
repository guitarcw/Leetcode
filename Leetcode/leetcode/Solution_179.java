package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

//179.largest Number
public class Solution_179 {
	//�����������ַ���ΪASCII�룬����֮�������ȱ�㡣��ʱ����ֵ��ص�������Խ����ַ����
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
		return result.toString(); //StringBuilder ���ǵ�ת��ΪString����
	}
	

}
