package com.changshuogao.solution07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Find if there is a cycle in a list of parent-child tuples. 

You are given a list of tuples 

(a,b) => a is parent of b 
(b,c) => b is parent of c 
(c, d) => c is parent of d 
(d, a) => d is parent of a ----> Cycle detected.. 

Implement a Java method.*/

public class Solution07 {

	
	public static void main(String[] args) {
		Tuple t1=new Tuple('a', 'b');
		Tuple t2=new Tuple('b', 'c');
		Tuple t3=new Tuple('c', 'd');
		Tuple t4=new Tuple('d', 'a');
		
		List<Tuple> list=new ArrayList<Tuple>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		
		System.out.println(new Solution07().isCycle(list));
	}
	
	public boolean isCycle(List<Tuple> list){
		if(list==null){
			return false;
		}
		Map<Character, Character> map=new HashMap<Character, Character>();
		for(int i=0; i<list.size(); i++){
			char p=list.get(i).parent;
			char c=list.get(i).child;
			if(!map.containsKey(p)){
				map.put(p, 'p');
			}
			if(map.containsKey(c)){
				if(map.get(c)=='p'){
					return true;
				}
			}
			else{
				map.put(c, 'c');
			}
		}
		return false;
	}
}
