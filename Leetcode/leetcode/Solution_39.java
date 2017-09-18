package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_39 {
public List<List<Integer>> combinationSum(int[] candidates, int target) {
	List<List<Integer>> out=new ArrayList<>();
	if(candidates.length<=0||target<0||candidates==null) return out;
	int sum=0;
	int start=0;int end=candidates.length-1;
	while(end<candidates.length&&candidates[end]>target) end--;
	sum+=end
	while(start<end) {
		
		
	}
        
    }
public List<List<Integer>> search(int[] can,int start,int end,int target){
	
}

}
