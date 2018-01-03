package leetcode;
//205.Isomorphic Strings
public class Solution_205 {
	public static boolean isIsomorphic(String s,String t) {
		if(s.equals(t)) return true; 
		int lenS=s.length();
		int lenT=t.length();
		if(lenS!=lenT) return false;
		char[] charS=s.toCharArray();
		char[] charT=t.toCharArray();
		for (int i = 0; i < charT.length; i++) {
			int indexS=0,indexT=0;
			while(indexS<=i&&charS[i]!=charS[indexS]) indexS++;
			while(indexT<=i&&charT[i]!=charT[indexT]) indexT++;
			if(indexS!=indexT) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		boolean k=isIsomorphic("egg", "add");
		System.out.println(k);
	}

}
