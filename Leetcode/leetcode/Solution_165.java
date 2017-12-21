package leetcode;
//165.Compare Version Number 
public class Solution_165 {
	public int compareVersion(String version1,String version2 ) {
		String[] strs1=version1.split("[.]");
		String[] strs2=version2.split("[.]");
		int max=Math.max(strs1.length, strs2.length);
		for(int i=0;i<max;i++) {
			Integer v1=i<strs1.length?Integer.parseInt(strs1[i]):0;//这两步很有意思，当处理不等长数据
			Integer v2=i<strs2.length?Integer.parseInt(strs2[i]):0;//对应位数没有说明为零
			int result=v1.compareTo(v2);
			if(result!=0)
				return result;
		}
		return 0;
	}

}
