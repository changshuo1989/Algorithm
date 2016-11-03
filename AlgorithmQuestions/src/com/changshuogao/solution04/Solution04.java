package com.changshuogao.solution04;

import java.util.HashMap;

/*Find the second most frequent occurring integer in a given array of integers */ 
public class Solution04 {
	
	public static void main(String[] args) {
		int[] nums={1,2,1,2,2,3,4,5,6,7,2,2,2,2,1};
		int res=new Solution04().findSecond(nums);
		System.out.println(res);
	}
	
	public int findSecond(int[] nums){
		if(nums == null || nums.length==0){
			return -1;
		}
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length; i++){
			if(map.containsKey(nums[i])){
				int value=map.get(nums[i]);
				map.put(nums[i], value+1);
			}
			else{
				map.put(nums[i],1);
			}
		}

		int firstValue=0;
		int first=0;
		int secondValue=0;
		int second=0;
		
		for(int key: map.keySet()){
			if(map.get(key)> firstValue && map.get(key)> secondValue){
				second=first;
				first=key;
				
				secondValue=firstValue;
				firstValue=map.get(key);
				
			}
			else if(map.get(key) > secondValue){
				second=key;
				secondValue=map.get(key);
			}
		}
		return second;
	}
	
}
