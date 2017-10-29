package leetcode;
import java.util.LinkedList;
import java.util.List;
//Path Sum ||
public class Solution_113 {
	public List<List<Integer>> pathSum(TreeNode root,int sum){
		List<List<Integer>> result=new LinkedList<>();
		List<Integer> temp=new LinkedList<>();
		if(root==null) return result;
		getPath(root, sum, result, temp);
		return result;
		
	}
	public void getPath(TreeNode root,int sum,List<List<Integer>> result,List<Integer> temp){//咩有考虑如何退出，递归
		if(root==null) return;
		if(root.left==null&&root.right==null&&sum==root.val) {
			temp.add(root.val);
			result.add(new LinkedList<>(temp));
			temp.remove(temp.size()-1);
			return;
		}
		temp.add(root.val);
		if(root.left!=null&&root.right==null) {
			getPath(root.left, sum-root.val, result, temp);
		}
		else if(root.left==null&&root.right!=null) getPath(root.right, sum-root.val, result, temp);
		else {
			getPath(root.left, sum-root.val, result, temp);
			getPath(root.right, sum-root.val, result, temp);
		}
		temp.remove(temp.size()-1);
	}

}
