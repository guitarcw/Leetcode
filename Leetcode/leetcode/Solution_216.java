package leetcode;
//216. Combination Sum |||

import java.util.ArrayList;
import java.util.List;

public class Solution_216 {
	public static List<List<Integer>> combinationSum3(int k, int n){
		List<List<Integer>> result=new ArrayList<>();
		List<Integer> temp=new ArrayList<>();
		if(k>9||n<=0) return result;
		helper(k, n, 1, temp, result);
		return result;
	}
	public static void helper(int k,int n,int index,List<Integer> temp,List<List<Integer>> result ){
		if(n==0&&k==0) {
			List<Integer> li = new ArrayList<Integer>(temp);
			result.add(li);
			return; //回溯方法，然后判断的部分
		} 
		for(int i=index;i<=9;i++) {
			temp.add(i);
			helper(k-1, n-i, i+1, temp, result);
			temp.remove(temp.size()-1);
		}
	}
	public static void main(String[] args) {
		List<List<Integer>> result=combinationSum3(3,15);
		System.out.println(result);
	}

}
