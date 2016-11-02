package com.changshuogao.solution03;
/*Write a program for Binary Search */

public class Solution03 {
	
	
	public static void main(String[] args) {
		int[] arr={10, 20, 31, 98, 123, 232, 10000,1000001};
		int index=new Solution03().binarySearch(arr, 10000);
		System.out.println(index);
	}
	
	public int binarySearch(int[] arr, int target){
		if(arr==null || arr.length==0){
			return -1;
		}
		int len=arr.length;
		
		int low=0, high=len-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid]==target){
				return mid;
			}
			else if(arr[mid]>target){
				high=mid-1;
			}
			else{
				low=mid+1;
			}
		}
		return -1;
	}
}
