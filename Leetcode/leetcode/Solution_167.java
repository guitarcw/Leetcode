package leetcode;
//167.Two Sum ||-input array is sorted
public class Solution_167 {
	public int[] twoSum(int[] numbers,int target) {
		int start=1;int end=numbers.length;
		int sum=numbers[start-1]+numbers[end-1];
		while(start<end) {
			if(sum==target) return new int[] {start,end};
			else if(sum<target) start++;
			else end--;
			sum=numbers[start-1]+numbers[end-1];
		}
		return new int[] {start,end};
	}

}
