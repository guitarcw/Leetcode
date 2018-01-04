package leetcode;
//208.Implement Trie (Prefix Tree)
public class Solution_208 {
	//数组内元素非null 就表示存在这个字母，通过 ‘isWord’ 判断此处是否有单词
	class Trie{
		private TrieNode root;
		public Trie() {
			root=new TrieNode();
		}
		public void insert(String word) {
			TrieNode temp=root;
			char[] chars=word.toCharArray();
			for (char c : chars) {
				if(temp.curr[c-'a']==null)
					temp.curr[c-'a']=new TrieNode();
				temp=temp.curr[c-'a'];
			}
			temp.isWord=true;
		}
		public boolean search(String word) {
			TrieNode temp=root;
			char[] chars=word.toCharArray();
			for (char c : chars) {
				if(temp.curr[c-'a']==null)
					return false;
				temp=temp.curr[c-'a'];
			}
			return temp.isWord;
		}
		public boolean startWith(String prefix) {
			TrieNode temp=root;
			char[] chars=prefix.toCharArray();
			for (char c : chars) {
				if(temp.curr[c-'a']==null)
					return false;
				temp=temp.curr[c-'a'];
			}
			return true;
		}
	}
	

}
class TrieNode{
	public boolean isWord=false;
	public TrieNode[] curr=new TrieNode[26];
	public TrieNode() {
		
	}
}
