package leetcode;
import java.util.ArrayList;
import java.util.List;
//Subsets
public class Solution_78 {
public final List<List<Integer>> result=new ArrayList<List<Integer>>(); 
public List<List<Integer>> subsets(int[] nums){
	int len=nums.length;
	List<Integer> temp=new ArrayList<>();
	getSub(nums, len, temp, 0);
	return result;
	
}
public void getSub(int[] nums,int len,List<Integer> temp,int k) {
	result.add(new ArrayList<>(temp));
	while(k<len) {
		temp.add(nums[k]);
		getSub(nums, len, temp, k+1);
		temp.remove(temp.size()-1);
		k++;
	}
}
}
