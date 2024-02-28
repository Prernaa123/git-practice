package LinkedListProg;

public class LinkedListImpl {
	Node head;
	void insert(int ele) {
		Node n = new Node(ele);//Node is created which contains data and next address
		if(head==null) {//LinkedList is not present
			head = n; //n is a address of next element 
		}
		else
		{
			Node temp = head;
			while(temp.next!=null) {//next-->next address
				temp = temp.next;
			}
			temp.next = null;
		}
		System.out.println(ele+" had been inserted successfully..!!!");
	}
	
	void display() {
		System.out.println("======Linked List Data======");
		if(head==null) {
			System.out.println("Linked List is empty...!!");
		}else {
			Node temp = head;
			while(temp.next!=null) {
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
		System.out.println("==========================");
	}
	
	void insertFront(int ele) {
		Node n = new Node(ele);//New Node is created 
		if(head==null) {
			head = n; 
			
		}
		else {
			n.next=head;
			head=n;
			}
		System.out.println(ele+" had been inserted successfully...!!!");
	}
	
	void delete() {
		if(head==null) {
			System.out.println("Linked List is empty...!!");
		}
		else {
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			System.out.println(temp.next.data+" had been deleted....!!!");
			temp.next=null;
		}
	}
	
	
}
