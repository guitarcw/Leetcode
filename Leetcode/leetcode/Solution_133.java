package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Clone Graph
public class Solution_133 {
	public Map<Integer, UndirectedGraphNode> map=new HashMap<>();
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if(node==null) return null;
		if(map.containsKey(node.label)) return map.get(node.label);//������ѭ��������˵ͼ��������Ȧ����ʽ
		UndirectedGraphNode result=new UndirectedGraphNode(node.label);
		map.put(node.label, result);
		for (UndirectedGraphNode undirectedGraphNode : node.neighbors) {
			result.neighbors.add(cloneGraph(undirectedGraphNode));
		}
		return result;
	}

}
