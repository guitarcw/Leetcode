package leetcode;

public class Solution_34 {
	public int[] searchRange(int[] nums,int target){
		int staout=-1;
		int endout=-1;
		int start=0;int end=nums.length-1;
		while(start<=end){
			int middle=(start+end)/2;
			if(nums[middle]==target){
				staout=endout=middle;
				for (int i = middle+1; i <=end; i++) {
					if(nums[i]!=target) break;
					endout++;
				}
				for (int i = middle-1; i >=start; i--) {
					if(nums[i]!=target) break;
					staout--;
				}
				break;
			}else{
				if(target>nums[middle]){
					start=middle+1;
				}
				else end=middle-1;
			}
			
		}
		int[] out={staout,endout};
		return  out;
	}

}
