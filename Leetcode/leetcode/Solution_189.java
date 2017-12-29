package leetcode;

import javafx.scene.transform.Rotate;

//189. Rotate Array
public class Solution_189 {
	public static void rotate(int[] nums, int k) {
		if(nums==null||nums.length==0||k==0) return ;
		k=k%nums.length;
		if(k==0) return;
		int count=0;
		for(int start=0;count<nums.length;start++) {//��һ�㣬����ԭ�ȵ�˼��˼·�ܽ�Ĺ��ɴ��ڴ�������ľͲ�һ������������count����
				int index=start;
				int pre=nums[start];
				do {
					index=index+k;
					index=index%nums.length;
					int temp=nums[index];
					nums[index]=pre;
					pre=temp;
					count++;
				} while (index!=start);
	
				}
			
	}
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6};
		rotate(nums, 2);
	}

}
