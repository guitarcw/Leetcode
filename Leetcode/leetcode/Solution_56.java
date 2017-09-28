package leetcode;
//Given a collection of intervals, merge all overlapping intervals.
//
//For example,
//Given [1,3],[2,6],[8,10],[15,18],
//return [1,6],[8,10],[15,18].

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution_56 {
public List<Interval> merge(List<Interval> intervals){
	List<Interval> list=new ArrayList<>();
	if(intervals==null||intervals.size()==0) return list;
	Collections.sort(intervals, new Comparator<Interval>() {
		@Override
		public int compare(Interval o1, Interval o2) {
			// TODO Auto-generated method stub
			return o1.start-o2.start;
		}
		
	});
	int sta=intervals.get(0).start;
	int end=intervals.get(0).end;
	for (Interval in: intervals) {//判断前后关系
		if(in.start<=end) end=Math.max(end, in.end);
		else {
			list.add(new Interval(sta, end));
			sta=in.start;
			end=in.end;
		}
	}
	list.add(new Interval(sta, end));
	return list;
	
}
}
