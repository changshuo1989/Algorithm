package com.changshuogao.solution02;
/*How do u reverse a linked list?*/


public class Solution02 {

	
	public static void main(String[] args) {
		ListNode root=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode forth=new ListNode(4);
		root.next=second;
		second.next=third;
		third.next=forth;
		forth.next=null;
		
		ListNode newRoot=new Solution02().reverseLinkedList(root);
		System.out.println(newRoot.val);
		
	}
	
	public ListNode reverseLinkedList(ListNode root){
		if(root==null){
			return null;
		}
		ListNode current=root;
		ListNode next=root.next;
		root.next=null;
		while(next != null){
			ListNode temp=next.next;
			next.next=current;
			current=next;
			next=temp;
		}
		return current;
	}
	
	
}
