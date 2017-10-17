package leetcode;
//Gray Code

import java.util.ArrayList;
import java.util.List;

public class Solution_89 {
	public List<Integer> grayCode(int n){
		List<Integer> result=new ArrayList<>();
		result.add(0);
		for(int i=0;i<n;i++) {
			int size=result.size()-1;
			while(size>=0) {
				result.add(result.get(size--)|1<<i); //2的幂的表示形式，通过位移实现。
			}
		}
		return result;
		
	}

}
