package com.changshuogao.solution06;
/*Implement a D-QUEUE  */
public class Solution06 {
	public static void main(String[] args) {
		DQueue<Integer> queue=new DQueue<Integer>();
		queue.insertAtFront(1);
		queue.insertAtFront(2);
		queue.insertAtFront(3);
		queue.insertAtRear(4);
		queue.insertAtRear(5);
		try{
			System.out.println(queue.peekAtFront());
			System.out.print(queue.peekAtRear());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
