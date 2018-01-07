package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

//210.Course Schedule ||
public class Solution_210 {
	public static int[] findOrder(int numCourses,int[][] prerequisites) {
		ArrayList<Integer> result=new ArrayList<>();
		ArrayList<Integer>[] edge=new ArrayList[numCourses];
		int[] indegree=new int[numCourses];
		for(int i=0;i<prerequisites.length;i++) {
			int next=prerequisites[i][0];
			int pre=prerequisites[i][1];
			indegree[next]++;
			if(edge[pre]==null) {
				edge[pre]=new ArrayList<>();
			}
			edge[pre].add(next);
		}
		LinkedList<Integer> zero=new LinkedList<>();
		for (int i = 0; i < indegree.length; i++) {
			if(indegree[i]==0) zero.add(i);
		}
		while(!zero.isEmpty()) {
			int curr=zero.pop();
			result.add(curr);
			if(edge[curr]==null) continue;
			for (Integer n : edge[curr]) {
				if(--indegree[n]==0) {
					zero.add(n);
				}
			}
		}
		int[] ret = new int[result.size()]; 
		Iterator<Integer> iter = result.iterator();
		for (int i=0; iter.hasNext(); i++) { 
		 ret[i] = iter.next(); 
		} 
		return (result.size()!=numCourses)?new int[0]:ret;
	}

	public static void main(String[] args) {
		int[][] nums= {{1,0}};
		// TODO Auto-generated method stub
		System.out.println(findOrder(2, nums));

	}

}
