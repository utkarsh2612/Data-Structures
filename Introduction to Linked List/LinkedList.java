class LinkedList
{
	static class Node		//this is class Node which provide basic structure for linked list i.e. node
	{
		int data;
		Node next;
		Node(int d)		//here data and next to Node is initialised
		{
			data=d;
			next=null;
		}
	}
	
	Node head;
	
	public void printList()
	{
		Node n = head;		//n is just like temp variable that is used to traverse complete list and print data
		while(n!=null)
		{
			System.out.println(n.data+" ");
			n=n.next;
		}	
	}

	public static void main(String args[])
	{
		LinkedList llist=new LinkedList();	//we created an object of class LinkedList i.e llist
		llist.head = new Node(1);		//with llist we used head node and called it constructor with value 1
		Node first = new Node(2);
		Node second = new Node(3);
		
		llist.head.next=first;			//here we are linking various nodes of llist so that they could know which to point next
		first.next=second;
		llist.printList();		//simply printing the list
	}
}
