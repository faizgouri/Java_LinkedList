public class Application
{
	public static void main(String args[])
	{
		
		DoublyLL dll = new DoublyLL();
		dll.addBack("Ramesh");
		dll.addBack("Suresh");
		dll.addFront("Jeegnes");
		dll.addFront("Mahesh");
		dll.removeBack();
		dll.removeBack();
		dll.addBack("Tapesh");
		dll.addFront("Bhavesh");
		dll.removeFront();
		dll.removeFront();
		dll.removeFront();
		dll.removeFront();
		dll.display();
		
		/*CircularLL cll = new CircularLL();
		cll.addBack("Ramesh");
		cll.addBack("Suresh");
		cll.addFront("Jeegnes");
		cll.removeFront();
		cll.removeBack();
		cll.display();*/
		
		/*LinkedList ll = new LinkedList();
		ll.addFront("Apple");
		ll.addFront("Boy");
		ll.addFront("Cat");
		ll.addBack("Boy");
		ll.addBack("Boy");
		ll.addBack("Boy");
		ll.addBack("Dog");
		ll.addBack(new Node("Boy"));
		System.out.println(ll.size());
		ll.display();
		//ll.removeDup();
		System.out.println(ll.size());
		System.out.println(ll.nthBack(1).getData());
		//ll.display();
		System.out.println();
		ll.deleteAll(new Node("Boy"));
		ll.display();*/
	}
}
