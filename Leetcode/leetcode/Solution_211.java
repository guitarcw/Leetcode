package leetcode;

public class Solution_211 {
//211.Add and Search Word Data structure design
	
	class WordDictionary{
		class TrieNode {
			   public TrieNode[] children = new TrieNode[26];
			   public boolean item=false;
		   	}
		private TrieNode root;
		public WordDictionary() {
			root=new TrieNode();
		}
		public void addWord(String word) {
			char[] chars=word.toCharArray();
			TrieNode temp=root;
			for (char c : chars) {
				if (temp.children[c-'a']==null) {
					temp.children[c-'a']=new TrieNode();
				}
				temp=temp.children[c-'a'];
			}
			temp.item=true;
		}
		public boolean match(char[] chars,int index,TrieNode node) {
			if(index==chars.length) return node.item;
			if(chars[index]=='.') {
				for(int i=0;i<node.children.length;i++) {
					if(node.children[i]!=null&&match(chars, index+1, node.children[i]))
						return true;
				}
			}
			else if(node.children[chars[index]-'a']!=null&&match(chars, index+1, node.children[chars[index]-'a']))
				return true;
			return false;
		}
		public boolean search(String word) {
			return match(word.toCharArray(), 0, root);
		}
	}
	
}
   
