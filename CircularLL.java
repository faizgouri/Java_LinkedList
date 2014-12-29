public class CircularLL
{
	private Node head;
	
	//constructor
	CircularLL()
	{
		head = null;
	}
	
	// add a new node to the front of Circular linked list
	void addFront(String str)
	{
		Node nd = new Node(str);
		if(head == null)
		{
			head = nd;
			nd.setNext(head);
			return;
		}
		Node temp = head;
		for(; temp.getNext() != head; temp = temp.getNext())
		{
		}
		temp.setNext(nd);
		nd.setNext(head);
		head = nd;
		
		
	}
		
	// add a new node in the last of linked list
	void addBack(String str)
	{
		Node nd = new Node(str);
		if(head == null)
		{
			head = nd;
			nd.setNext(head);
			return;
		}
		Node temp = head;
		while(temp.getNext() != head)
		{
			temp = temp.getNext();
		}
		temp.setNext(nd);
		nd.setNext(head);
	}
	
	// remove front element of linked list
	void removeFront()
	{
		if(head == null)
		{
			System.out.println("Linked List is Empty !!");
			return;
		}
		// if  CLL has only one Node  
		if(head.getNext() == head)
		{
			head = null;
			return;
		}
		Node temp = head;
		for(; temp.getNext() != head; temp = temp.getNext())
		{
		}	
		temp.setNext(temp.getNext().getNext());
		head = head.getNext();
	}
	
	//remove last element of linked list
	void removeBack()
	{
		if(head == null)
		{
			System.out.println("Linked list is Empty !!");
			return;
		}
		if(head.getNext() == head)
		{
			head = null;
			return;
		}
		
		Node temp = head;
		while(temp.getNext().getNext() != head)
		{
			temp = temp.getNext();
		}
		temp.setNext(head);
	}
	void display()
	{
		if(head == null)
		{
			System.out.println("Linked List is Empty !!");
			return;
		}
		else
		{
			Node temp = head;
			do
			{
				System.out.print(temp.getData()+"->");
				temp = temp.getNext();
			}while(temp != head);
		}
	}
}