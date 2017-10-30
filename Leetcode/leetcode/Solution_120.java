package leetcode;

import java.util.List;

// Triangle
public class Solution_120 {
	public int minimumTotal(List<List<Integer>> triangle) {//DP算法的idea还是没有理解清楚
		if(triangle==null) return 0;
		int size=triangle.size();
		for(int i=size-2;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				int temp=triangle.get(i).get(j);
				triangle.get(i).set(j,temp+Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
			}
		}
		return triangle.get(0).get(0);
		
	}
	
	/*
	public int getMin(List<List<Integer>> tr,int index,int i) {
		if(index>=tr.size()) return 0;
		int sum=tr.get(index).get(i)+Math.min(getMin(tr, index+1, i), getMin(tr, index+1, i+1));
		return sum;
	}*/ //时间问题，考虑使用动态规划方法（DP）

}
