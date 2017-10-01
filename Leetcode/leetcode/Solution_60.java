package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution_60 {
	public String getPermutation(int n,int k) {
		StringBuilder result=new StringBuilder();
		int[] divisors=new int[n+1];
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=n;i++) list.add(i);
		divisors[0]=1;
		for(int i=1;i<=n;i++) divisors[i]=divisors[i-1]*i;
		if(k>divisors[n-1]*n) return String.valueOf(result);
		k--;
		for(int i=1;i<=n;i++) {
			int index=k/divisors[n-i];
			result.append(String.valueOf(list.get(index)));
			list.remove(index);
			k=k%divisors[n-i];
		}
		return String.valueOf(result);
		
	}

}
