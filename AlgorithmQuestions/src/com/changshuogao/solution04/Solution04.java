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
		int res=-1;
		
		for(int key: map.keySet()){

		}
		return res;
	}
	
}
