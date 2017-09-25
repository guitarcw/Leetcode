package leetcode;

public class Solution_50 {
	public double myPow(double x,double n) {
		if(n==0) return 1;
		double temp=myPow(x,n/2);
		if(n%2==0) return temp*temp;
		else if(n%2>0)return temp*temp*x;
		else return temp*temp/x;
	}

}
