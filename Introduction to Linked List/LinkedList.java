class LinkedList
{
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	Node head;
	
	public void printList()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.println(n.data+" ");
			n=n.next;
		}	
	}

	public static void main(String args[])
	{
		LinkedList llist=new LinkedList();
		llist.head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);
		
		llist.head.next=first;
		first.next=second;
		llist.printList();
	}
}