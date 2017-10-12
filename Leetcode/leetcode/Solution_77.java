package leetcode;

import java.util.ArrayList;
import java.util.List;

//Combinations
public class Solution_77 {
	public final List<List<Integer>> result=new ArrayList<List<Integer>>();
	public List<List<Integer>> combing(int n,int k){
		List<Integer> temp=new ArrayList<>();
		getCombing(temp, n, k, 1);
		return result;
	}
	public void getCombing(List<Integer> temp,int n,int k,int m) {
		if(temp.size()==k) {result.add(new ArrayList<>(temp)); return;}//问题类本身添加进List，注意，important
		while(m<=n) {
			temp.add(m);
			getCombing(temp, n, k, m+1);
			temp.remove(temp.size()-1);
			m++;//细心少加了内容
		}
	}

}
