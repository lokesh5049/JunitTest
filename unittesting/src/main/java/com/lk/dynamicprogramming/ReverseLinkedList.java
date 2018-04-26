package com.lk.dynamicprogramming;

/*
 * Write a sample code to reverse Singly Linked List by iterating through it only once.

Recursive Method:
	1) Divide the list in two parts - first node and rest of the linked list.
	2) Call reverse for the rest of the linked list.
	3) Link rest to first.
	4) Fix head pointer.
 * 
 * 
 * 
 */
public class ReverseLinkedList {

	private Node head;
	private static int size=0;

	/*
	 * add data in Integer formate next ref of next node return type is boolean
	 * 
	 */
	public void add(int data) {
		
		if (head == null) {
			head=new Node();
			head.setData(data);	
		}
		Node newNode = new Node();
		newNode.setData(data);
		Node temp=head;
		if(temp!=null){
			while(temp.getNext()!=null){
			temp=temp.getNext();	
			}
			
		     temp.setNext(newNode);
			}
		size++;
				
	}
	
	public void addFirst(int data){
		
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(null);
		System.out.println(data);
		if(head==null){
		 add(data);		
		 }
		if(head!=null){
			System.out.println(head.getData());
			newNode.setNext(head);
			head=newNode;
			System.out.println(head.getData());
		}
		size++;
		
	}
	
	Integer getSize(){
		
		if(size!=0){
			return size;
		}
		
		
		return null;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String datas = "";
		Node temp = head;
		if(head!=null){
			
		while (temp!= null) {
			datas +="["+temp.getData().toString()+"]";
			temp = temp.getNext();
		}
		}
		return datas;
	}

	static class Node {

		private Integer data;
		private Node next;

		public Integer getData() {
			return data;
		}

		public void setData(Integer data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	public static void main(String[] args) {

		ReverseLinkedList lkList = new ReverseLinkedList();
		lkList.add(22);
		lkList.add(45);
		lkList.add(3);
		lkList.add(75);
		lkList.add(800);
		lkList.addFirst(25);
		//lkList.traverse();
		System.out.println(lkList.toString());
        System.out.println(lkList.getSize());
	}

}
