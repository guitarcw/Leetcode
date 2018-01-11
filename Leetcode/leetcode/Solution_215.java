package leetcode;
//215.Kth Largest Element in an Array
public class Solution_215 {
	//初步想法使用快速排序
	public static int findKthLargest(int[] nums,int k) {
		if(nums==null) return 0;
		int result;
		return result=findKthHelper(nums, k-1, 0, nums.length-1);
	}
	private static int findKthHelper(int[] number,int k,int start,int end) {
		
		int key=number[start];
		int iStart=start;
		int iEnd=end;
		while(iStart<iEnd) {
			while(iStart<iEnd&&key>number[iEnd]) iEnd--;
			while(iStart<iEnd&&key<=number[iStart]) iStart++;
			int temp=number[iStart];
			number[iStart]=number[iEnd];
			number[iEnd]=temp;
		}
		int temp=number[start];
		number[start]=number[iEnd];
		number[iEnd]=temp;
		if(iStart<k) return findKthHelper(number, k, iStart+1, end);
		else if(iStart>k) return findKthHelper(number, k, start, iEnd-1);
		return number[iStart];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,1,5,6,4};
		System.out.println(findKthLargest(nums, 2));

	}

}
