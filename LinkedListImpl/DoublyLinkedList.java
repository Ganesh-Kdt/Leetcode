package LinkedListImpl;

class Node{
	int data;
	Node next;
	Node prev;
	
	Node(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}

public class DoublyLinkedList {
	Node head=null;
	Node temp=null;
	
	public void insertAtStart(int data) {
		Node n = new Node(data);
		if(head==null) {
			head=n;
			return ;
		}
		n.next=head;
		head.prev=n;
		head=n;
		
	}
	
	public void insertAtEnd(int data) {
		Node n = new Node(data);
		if(head==null) {
			head=n;
			return;
		}
		temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=n;
		n.prev=temp;
	}
	
	public void insertAtIndex(int data,int k) {
		temp=head;
		int count=1;

		while(temp!=null) {
			if(k==count) {
				Node n = new Node(data);
				temp.prev.next=n;
				n.next=temp;
				n.prev=temp.prev;
				temp.prev=n;
				break;
			}
			temp=temp.next;
			count++;
		}
	}
	
	public void deleteAtIndex(int k) {
		temp=head;
		int count=1;
		while(temp!=null && k!=count) {
			temp=temp.next;
			count++;
		}
		if(temp==head) {
			head=head.next;
			head.prev=null;
			return;
		}
		temp.prev.next=temp.next;
		if(temp.next!=null)
		temp.next.prev=temp.prev;
			
	}
	
	public void print() {
		temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			
			temp=temp.next;
		}
		System.out.println("----------------------------------------------------");
	}
}
