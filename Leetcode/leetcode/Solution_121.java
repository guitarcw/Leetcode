package leetcode;
//Best Time to Buy and Sell Stock
public class Solution_121 {
	public int maxprofit(int[] prices) {//另外的解法kadane's Algorithm
		if(prices.length<=0) return 0;
		int small;
		small=prices[0];
		int sum=0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i]<small) small=prices[i];
			else
			sum=Math.max(sum, prices[i]-small);
		}
		return sum;
	}

}
