package LinkedListImpl;

class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data=data;
        next=null;
    }
}

public class LinkedList<T>{
    Node<T> head=null;
    Node<T> tail=null;
    Node<T> temp=null;
    Node<T> prev=null;

    public void inserAtBeg(T data){
        Node<T> n = new Node<T>(data);
        n.next = head;
        head = n;
    }
    
    public void insertAtEnd(T data) {
    	Node<T> n = new Node<T>(data);
    	if(head==null) {
    		head=n;
    	}
    	else {
    		temp=head;
    		while(temp.next!=null)
    			temp=temp.next;
    		temp.next=n;
    	}
    }
    
    public void insert(T num,T data) {
    	temp=head;
    	Node<T> n = new Node<T>(data);
    	while(temp!=null && temp.data!=num) {
    		temp=temp.next;
    	}
    	n.next=temp.next;
    	temp.next=n;
    }
    
    public void removeHead() {
    	if(head==null)
    		return ;
    	head=head.next;
    }
    
    public void removeTail() {
    	if(head==null)
    		return;
    	else if(head.next==null)
    		head=head.next;
    	else {
    		temp=head;
    		while(temp.next.next!=null) {
    			temp=temp.next;
    		}
    		temp.next=null;
    	}
    }
    
    public void removeAtindex(int index) {
    	temp=head;
    	int count=1;
    	while(temp!=null && index!=count) {
    		prev=temp;
    		temp=temp.next;
    		count++;
    	}
    	if(temp==head) {
    		head=head.next;
    		return;
    	}
    	prev.next=temp.next;
    	temp.next=null;
    }
    
    public void print(){
        temp=head;
        while(temp!=null){
            System.out.println(temp.data+",");
            temp=temp.next;
        }
    }
}