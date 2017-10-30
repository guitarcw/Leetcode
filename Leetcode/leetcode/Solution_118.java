package leetcode;
//Pascal's Triangle

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution_118 {
	public List<List<Integer>> generate(int numRows){//想法比较技巧性，主要关注其特性
		List<List<Integer>> result=new ArrayList<>();
		List<Integer> temp=new LinkedList<>();
		for(int i=0;i<numRows;i++) {
			temp.add(0,1);
			for(int j=1;j<temp.size()-1;j++) {
				temp.set(j,temp.get(j)+temp.get(j+1));
			}
			result.add(new ArrayList<>(temp));
		}
		return result;
	}

}
