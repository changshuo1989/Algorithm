package com.changshuogao.solution01;

import java.util.Stack;

/*
 * given string array contains (),{}, []
 * return YES or NO, if they are matched
 * */

public class Solution01 {
	
	
	public static void main(String[] args) {
		String[] arr={"{[([])]}","{}[][]()", "{[}]"};
		String[] res=new Solution01().findMatch(arr);
		for(int i=0; i<res.length; i++){
			System.out.println(res[i]);
		}
	}

	
	public String[] findMatch(String[] arr){
		if(arr==null){
			return null;
		}
		int len=arr.length;
		String[] res=new String[len];
		for(int i=0; i<len; i++){
			String str=arr[i];
			Stack<Character> stack=new Stack<Character>();
			boolean match=true;
			for(int j=0; j<str.length(); j++){
				char c=str.charAt(j);
				if(c=='(' || c=='[' || c=='{'){
					stack.push(c);
				}
				else{
					if(stack.empty()){
						match=false;
						break;
					}
					else{
						if((c==')' && stack.peek()=='(') || (c==']' && stack.peek()=='[') || (c=='}' && stack.peek()=='{')){
							stack.pop();
						}
						else{
							match=false;
							break;
						}
					}
				}
			}
			if(!stack.isEmpty()){
				match=false;
			}
			if(match){
				res[i]="YES";
			}
			else{
				res[i]="NO";
			}
		}
		return res;
	}
}
