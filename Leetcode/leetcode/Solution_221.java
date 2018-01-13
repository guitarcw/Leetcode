package leetcode;
//221.Maximal Square
public class Solution_221 {
	//DP���뷨�й������������뵽�ܺõļ�¼����״̬�ķ�����
	public int maximalSquare(char[][] matrix) {
		int result=0;
		if(matrix==null||matrix.length==0) return result;
		int cols=matrix.length;
		int rows=matrix[0].length;
		int[][] compare=new int[cols+1][rows+1]; //���������� ��Ϊ�˱��⿼��������������Զ����������
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				if(matrix[i][j]=='1') {
					compare[i+1][j+1]=Math.min(Math.min(compare[i][j], compare[i+1][j]),compare[i][j+1])+1;
					result=Math.max(result, compare[i+1][j+1]);
				}
			}
		}
		return result*result;
	}
		
	}

