package leetcode;
//gas station
public class Solution_134 {
	public int canCompleteCircuit(int[] gas,int[] cost) {
		int need=0;//��ɺ���·����Ҫ��gas
		int sum=0;//ʣ��gas
		int index=0;//λ��
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
