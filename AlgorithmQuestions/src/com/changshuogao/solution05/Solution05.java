package com.changshuogao.solution05;

import java.util.Arrays;

/*You have an array which has only '0's or '1's. you need to get 1's first and then 0's.  */
public class Solution05 {
	
	public static void main(String[] args) {
		int[] arr={1,0,1,1,0,1,1};
		new Solution05().Segregate(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public void Segregate(int[] arr){
		if(arr==null){
			return;
		}
		int len=arr.length;
		int low=0, high=len-1;
		while(low<high){
			if(arr[low]==1){
				low++;
			}
			else if(arr[high]==0){
				high--;
			}
			else{
				arr[low]=1;
				arr[high]=0;
				low++;
				high--;
			}	
		}
	}
}
