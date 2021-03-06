package leetcode;

import java.util.ArrayList;
import java.util.List;

//Restore IP Address
public class Solution_93 {
	public List<String> restoreIpAddresses(String s){
		List<String> res = new ArrayList<String>();//考虑使用回溯法，无辜增加复杂度。所以放弃
        int len = s.length();//仔细思考与回溯法的思想相背离，
        for(int i = 1; i<4 && i<len-2; i++){
            for(int j = i+1; j<i+4 && j<len-1; j++){
                for(int k = j+1; k<j+4 && k<len; k++){
                    String s1 = s.substring(0,i), s2 = s.substring(i,j), s3 = s.substring(j,k), s4 = s.substring(k,len);
                    if(isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)){
                        res.add(s1+"."+s2+"."+s3+"."+s4);
                    }
                }
            }
        }
        return res;
    }
	public boolean isValid(String s){
        if(s.length()>3 || s.length()==0 || (s.charAt(0)=='0' && s.length()>1) || Integer.parseInt(s)>255)
            return false;
        return true;
    }
		
		
	}
	
	


