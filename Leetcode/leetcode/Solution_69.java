package leetcode;
//Sqrt(X)
public class Solution_69 {
	public int mySqrt(int x) {
		int left=0;
		int right=x;
		int result=(left+right)/2;
		while(left<right) {
			if(Math.pow(result, 2)>x) right=result-1;
			else if(Math.pow(result+1,2)>x) //��Ŀ��Ҫ����� result��ƽ������ӽ� x�������
				return result;
			else
				left=result+1;
			result=(left+right)/2;
		}
		return result;
		
	}

}
