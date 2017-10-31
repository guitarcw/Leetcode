package leetcode;
//Best Time to Buy and Sell Stock ||
public class Solution_122 {
	public int maxPriofit(int[] prices) {
		int sum=0;
		for(int i=0;i<prices.length-1;i++) {
			sum+=Math.max(0, prices[i+1]-prices[i]);
		}
		return sum;
	}

}
