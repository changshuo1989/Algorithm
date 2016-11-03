package com.changshuogao.solution10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]*/
public class Solution10 {
	public static void main(String[] args) {
		int[] nums={-1,0,1,2,-1,-4};
		int target=0;
		List<List<Integer>> list=new Solution10().threeSum(nums, target);
		System.out.println(list.size());
		
	}
	
	public List<List<Integer>> threeSum(int[] nums, int target){
		if(nums==null){
			return null;
		}
		//important!!!
		Arrays.sort(nums);
		List<List<Integer>> resList=new ArrayList<List<Integer>>();
		for(int i=0; i<nums.length-2; i++){
			if(!(i>0 && nums[i]==nums[i-1])){
				findTwoNumber(nums, i, target, resList);
			}
		}
		return resList;
	}
	
	public void findTwoNumber(int[] nums, int i, int target, List<List<Integer>> resList){
		int num=nums[i];
		
		int left=i+1;
		int right=nums.length-1;
		
		while(left<right){
			if(left>i+1 && nums[left]==nums[left-1]){
				left++;
			}
			else if(right<nums.length-1 && nums[right]==nums[right+1]){
				right--;
			}
			else{
				if(nums[left]+nums[right]==target-num){
					
					List<Integer> list=new ArrayList<Integer>();
					list.add(num);
					list.add(nums[left]);
					list.add(nums[right]);
					resList.add(list);
					
					left++;
					right--;
				}
				else if(nums[left]+nums[right]<target-num){
					left++;
				}
				else{
					right--;
				}
			}
		}
	}
}
