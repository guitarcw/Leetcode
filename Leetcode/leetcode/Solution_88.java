package leetcode;
//Merage Sorted Array
public class Solution_88 {
	public void merge(int[] nums1,int m,int[] nums2,int n) {//数组类算法尽量避免移动数组
		int j=n-1;
		int i=m-1;
		int k=n+m-1;
		while(i>=0&&j>=0) {
			if(nums1[i]>nums2[j])
				nums1[k--]=nums1[i--];
			else nums1[k--]=nums2[j--];
		}
		while(j>=0) {
			nums1[k--]=nums2[j--];
		}
	}

}
