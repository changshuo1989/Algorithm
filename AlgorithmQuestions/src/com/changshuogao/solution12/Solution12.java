package com.changshuogao.solution12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]*/
public class Solution12 {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		if(root==null){
			return null;
		}
		List<List<Integer>> resList=new ArrayList<List<Integer>>();
		
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			
				
		}
	}
	
}
