package leetcode;

import java.util.ArrayList;
import java.util.List;

//Unique Binary Search Trees ||
public class Solution_95 {
	public List<TreeNode> generateTrees(int n){//Dp�㷨����ʵ�ֹ��̴��ڼ����ԣ��ص㿼�ǹ����е��ص�
		List<TreeNode>[] result=new List[n+1];//��ʼ���뷨Ƿȱȫ���ԣ����濼�ǲ��Ȼ������ӣ����̹��ڸ��ӣ��Ժ��������⿼�Ǵ洢�м���
		result[0]=new ArrayList<TreeNode>();
		if(n==0) return result[0];
		result[0].add(null);
		for(int len=1;len<=n;len++) {
			result[len]=new ArrayList<>();
			for(int i=0;i<len;i++) {
				for(TreeNode left:result[i]) {
					for(TreeNode right:result[len-i-1]) {
						TreeNode head=new TreeNode(i+1);
						head.left=left;
						head.right=clone(right,i+1);
						result[len].add(head);
					}
				}
			}
			
			
		}
		return result[n];
	}
	public TreeNode clone(TreeNode h,int m) {
		if(h==null) return null;
		TreeNode newH=new TreeNode(h.val+m);
		newH.left=clone(h.left,m);
		newH.right=clone(h.right,m);
		return newH;
	}
	

}
