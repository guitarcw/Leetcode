package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Solution_207 {
	//����- ʹ�����˵ķ�ʽ��ʹ�þ����ʾͼ��BFS(breadth first search)
	/*public boolean canFinish(int numCourses,int[][] prerequisites) {
		int[][] matrix=new int[numCourses][numCourses];
		int[] indegree=new int[numCourses];
		LinkedList<Integer> zero=new LinkedList<>();
		for(int i=0;i<prerequisites.length;i++) {
			int pre=prerequisites[i][0];
			int curr=prerequisites[i][1];
			matrix[curr][pre]=1;
			indegree[curr]++;
		}
		for (int i = 0; i < indegree.length; i++) {
			if(indegree[i]==0) zero.add(i);
		}
		int number=0;
		while(!zero.isEmpty()) {
			int i=zero.pop();
			number++;
			for(int j=0;j<numCourses;j++) {
				if(matrix[j][i]==1) {
					matrix[j][i]--;
					if((--indegree[j])==0)
						zero.add(j);
				}
			}	 
		}
		if(number==numCourses) return true;
		else return false;
	}*/
	//������ ʹ���б��ʾ�豸��DFS(depth first search)
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
