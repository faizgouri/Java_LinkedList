public class DoublyNode
{
	// data members
	
	private String data;
	private DoublyNode next;
	private DoublyNode prev;
	//constructors
	DoublyNode()
	{
		data = "";
		next = null;
		prev = null;
	}
	
	DoublyNode(String data)
	{
		this.data = data;
		next = null;
		prev = null;
	}
	
	// get and set methods()
	void setData(String data)
	{
		this.data = data;
	}
	void setNext(DoublyNode next)
	{
		this.next = next;
	}
	void setPrev(DoublyNode prev)
	{
		this.prev = prev;
	}
	String getData()
	{
		return data;
	}
	DoublyNode getNext()
	{
		return next; 
	}
	DoublyNode getPrev()
	{
		return prev;
	}
}