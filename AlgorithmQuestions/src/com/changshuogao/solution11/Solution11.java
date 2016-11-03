package com.changshuogao.solution11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/*Binary Tree Breath first search*/
public class Solution11 {
	
	
	public void bfs(TreeNode root){
		if(root==null){
			return;
		}
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode node=queue.remove();
			System.out.println(node.val);
			if(node.left!=null){
				queue.add(node.left);
			}
			if(node.right!=null){
				queue.add(node.right);
			}
		}
	}
}
