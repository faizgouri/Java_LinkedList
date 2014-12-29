public class Node
{
	// data members
	
	private String data;
	private Node next;
	//constructors
	Node()
	{
		data = "";
		next = null;
	}
	
	Node(String data)
	{
		this.data = data;
		next = null;
	}
	// get and set methods()
	void setData(String data)
	{
		this.data = data;
	}
	void setNext(Node next)
	{
		this.next = next;
	}
	String getData()
	{
		return data;
	}
	Node getNext()
	{
		return next; 
	}
}