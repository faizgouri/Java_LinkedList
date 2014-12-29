public class DoublyLL
{
	private DoublyNode head;
	private DoublyNode tail;
	
	//constructor
	DoublyLL()
	{
		head = null;
		tail = null;
	}
	
	// add a new node to the front of linked list
	void addFront(String str)
	{
		DoublyNode nd = new DoublyNode(str);
		if(head == null && tail == null)
		{
			head = nd;
			tail = nd;
			return;
		}
		nd.setNext(head);
		head.setPrev(nd);
		head = nd;
	}
	void addFront(DoublyNode nd)
	{
		if(head == null && tail == null)
		{
			head = nd;
			tail = nd;
			return;
		}
		nd.setNext(head);
		head.setPrev(nd);
		head = nd;
	}
	
	// add a new node in the last of linked list
	void addBack(String str)
	{
		DoublyNode nd = new DoublyNode(str);
		if(head == null && tail == null)
		{
			head = nd;
			tail = nd;
			return;
		}
		nd.setPrev(tail);
		tail.setNext(nd);
		tail = nd;
	}
	void addBack(DoublyNode nd)
	{
		if(head == null && tail == null)
		{
			head = nd;
			tail = nd;
			return;
		}
		nd.setPrev(tail);
		tail.setNext(nd);
		tail = nd;
	}
	
	// remove front element of linked list
	void removeFront()
	{
		if(head == null)
		{
			System.out.println("Linked List is Empty !!");
			return;
		}
		
		// DLL has only one Node
		if(head == tail)
		{
			head = null;
			tail = null;
			return;
		}
		head = head.getNext();
		head.setPrev(null);
	}
	
	//remove last element of linked list
	void removeBack()
	{
		if(head == null)
		{
			System.out.println("Linked list is Empty !!");
			return;
		}
		// DLL has single node
		if(head == tail)
		{
			head = null;
			tail = null;
			return;
		}
		tail = tail.getPrev();
		tail.setNext(null);
	}
	void display()
	{
		if(head == null)
		{
			System.out.println("Linked List is Empty !!");
		}
		else
		{
			DoublyNode temp = head;
			while(temp != null)
			{
				System.out.print(temp.getData()+"->");
				temp = temp.getNext();
			}
		}
	}
		
	// return total number of nodes in Linked List
	int size()
	{
		int size_ = 0;
		for(DoublyNode temp = head; temp != null; temp = temp.getNext())
		{
			size_++;
		}
		return size_;
	}
	
}