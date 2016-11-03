package com.changshuogao.solution06;

public class DQueue<T> {
	private Node<T> front;
	private Node<T> rear;
	
	private int size;
	
	public DQueue(){
		front=null;
		rear=null;
		size=0;
	}
	public boolean isEmpty(){
		if(size==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int getSize(){
		return size;
	}
	//insert in the front
	public void insertAtFront(T val){
		Node<T> node=new Node<T>(val);
		if(front==null){
			front=node;
			rear=front;
		}
		else{
			node.setNext(front);
			front=node;
		}
		size++;
	}
	//insert in the rear
	public void insertAtRear(T val){
		Node<T>node=new Node<T>(val);
		if(rear==null){
			front=node;
			rear=front;
		}
		else{
			rear.setNext(node);
			rear=node;
		}
	}
	
	//remove from front
	public T removeAtFront() throws Exception{
		if(isEmpty()){
			throw new Exception("Underflow Exception");
		}
		T element=front.getVal();
		front=front.getNext();
		if(front==null){
			rear=null;
		}
		size--;
		return element;
		
	}
	
	//remove from rear
	public T removeAtRear() throws Exception{
		if(isEmpty()){
			throw new Exception("Underflow Exception");
		}
		T element=(T)rear.getVal();

		if(front==rear){
			front=null;
			rear=null;
		}
		else{
			Node node=front;
			while(node.getNext().getNext()!=null){
				node=node.getNext();
			}
			node.setNext(null);
		}
		size--;
		return element;
	}
	
	public T peekAtFront() throws Exception{
		if(isEmpty()){
			throw new Exception("Underflow Exception");
		}
		return front.getVal();
	}
	
	public T peekAtRear() throws Exception{
		if(isEmpty()){
			throw new Exception("Underflow Exception");
		}
		return rear.getVal();
	}
}
