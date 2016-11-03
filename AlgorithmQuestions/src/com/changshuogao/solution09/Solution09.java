package com.changshuogao.solution09;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * 
 * Two Sum
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/

public class Solution09 {
	
	
	
	public static void main(String[] args) {
		int[] num={12,23,45,18,6,9};
		int[] res=new Solution09().twoSum(num, 29);
		System.out.println(Arrays.toString(res));
	}
	
	public int[] twoSum(int[] num, int target){
		if(num==null){
			return null;
		}
		int[] res=new int[2];
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0; i<num.length; i++){
			if(map.containsKey(target-num[i])){
				res[0]=map.get(target-num[i]);
				res[1]=i;
				return res;
			}
			else{
				map.put(num[i], i);
			}
		}
		return res;
		
	}
}
