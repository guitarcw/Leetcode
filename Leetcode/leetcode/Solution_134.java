package leetcode;
//gas station
public class Solution_134 {
	public int canCompleteCircuit(int[] gas,int[] cost) {
		int need=0;//完成后面路程需要的gas
		int sum=0;//剩余gas
		int index=0;//位置
		if(gas.length==0) return -1;
		for (int i = 0; i < gas.length; i++) {
			sum=sum+gas[i]-cost[i];
			if(sum<0) {
				need=need+sum;
				sum=0;
				index=i+1;
			}
			
		}
		if((sum+need)>=0) return index;
		return -1;
		
	}

}
