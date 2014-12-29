public class LinkedList
{
	private Node head;

	//constructor
	LinkedList()
	{
		head = null;
	}
	// add a new node to the front of linked list
	void addFront(String str)
	{
		Node nd = new Node(str);
		nd.setNext(head);
		head = nd;
	}
	void addFront(Node nd)
	{
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
		}
		else
		{
			Node temp = head;
			while(temp.getNext() != null)
			{
				temp = temp.getNext();
			}
			temp.setNext(nd);
		}
	}
	void addBack(Node nd)
	{
		if(head == null)
		{
			head = nd;
		}
		else
		{
			Node temp = head;
			while(temp.getNext() != null)
			{
				temp = temp.getNext();
			}
			temp.setNext(nd);
		}
	}
	// remove front element of linked list
	void removeFront()
	{
		if(head == null)
		{
			System.out.println("Linked List is Empty !!");
			return;
		}
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
		if(head.getNext() == null)
		{
			head = null;
			return;
		}
		
		Node temp = head;
		while(temp.getNext().getNext() != null)
		{
			//System.out.println(temp.getData());
			temp = temp.getNext();
		}
		temp.setNext(null);
	}
	void display()
	{
		if(head == null)
		{
			System.out.println("Linked List is Empty !!");
		}
		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.getData()+"->");
				temp = temp.getNext();
			}
		}
	}
	// This function will remove duplicate entries from an unsorted Linked List
	void removeDup()
	{
		if(head == null || head.getNext() == null)
		{
			return;
		}
		Node current = head;
		for(Node check = head; check.getNext() != null; check = check.getNext())
		{
			current = check; 
			while(current.getNext() != null) // can we use FOR loop here ???
			{		
				if(check.getData().equals(current.getNext().getData()))
				{
					current.setNext(current.getNext().getNext());
					continue;
				}
				current = current.getNext();
			}
		}
	}
	
	// return total number of nodes in Linked List
	int size()
	{
		int size_ = 0;
		for(Node temp = head; temp != null; temp = temp.getNext())
		{
			size_++;
		}
		return size_;
	}
	
	// return nth node from head of the Linkedlist
	Node nth(int n)
	{
		if(head == null)
		{
			return null;
		}
		if(n > size())
		{
		
			return null; 
		}
		Node temp = head;
		for(int i = 1; i < n; temp = temp.getNext(), i++)
		{
		}
		return temp;
	}
	
	// return nth node from last node of the Linkedlist
	Node nthBack(int n)
	{
		if(head == null)
		{
			return null;
		}
		if(n > size())
		{
		
			return null; 
		}
		Node temp = head;
		for(int i = 1; i < (size() - n + 1); temp = temp.getNext(), i++)
		{
		}
		return temp;
	}
	
	// delete node at nth position in LinkedList
	void deleteNth(int n)
	{
		if(head == null)
		{
			return;
		}
		if(n == 1)
		{
			head = head.getNext();
			return;
		}
		if(n > size())
		{
		
			return; 
		}
		Node current = head;
		for(int i = 1; i < (n - 1); current = current.getNext(), i++)
		{
		}
		current.setNext(current.getNext().getNext());
	}
	
	// delete first occurrence of the node which matches data with input node
	void deleteFirst(Node nd)
	{
		if(head == null)
		{
			return;
		}
		if(head.getData().equals(nd.getData()))
		{
			head = head.getNext();
			return;
		}
		for(Node temp = head; temp.getNext() != null; temp = temp.getNext())
		{
			if(temp.getNext().getData().equals(nd.getData()))
			{
				temp.setNext(temp.getNext().getNext());
				break;
			}
		}
	}
	
	// delete all the nodes with same data as input node
	void deleteAll(Node nd)
	{
		if(head == null)
		{
			return;
		}
		if(head.getData().equals(nd.getData()))
		{
			head = head.getNext();
		}
		Node temp = head;
		while(temp.getNext() != null) // can we use FOR loop here ???
		{
			if(temp.getNext().getData().equals(nd.getData()))
			{
				temp.setNext(temp.getNext().getNext());
				continue;
			}
			temp = temp.getNext();
		}
	}
	
	LinkedList addNum(LinkedList other)
	{
		LinkedList ll = new LinkedList();
		int carry = 0;
		// (this + other + carry) % 0; carry = (this + other + carry)/ 10
		return ll;
		
	}
}
