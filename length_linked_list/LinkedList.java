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
	public int count()
	{
		Node n=head;
		int counter=0;
		while(n!=null)
		{
			counter++;
			n=n.next;
		}
		return counter;
	}

	public int count_recur(Node n)
	{
		if(n==null)
			return 0;
		else
			return 1 + count_recur(n.next); 
	}

	public int count_rec(){
		return count_recur(head);
	}
	void print()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}


	void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;			
	}	
	public static void main(String args[])
	{
	int counter;
	LinkedList llist=new LinkedList();
	llist.push(1);
	llist.push(2);
	llist.push(3);
	llist.push(4);
	llist.print();
	counter=llist.count();
	System.out.println("The No. of lement in list : "+counter);		
	System.out.println("Count via recursive method:\n"+llist.count_recur(llist.head)); //or llist.count_rec();
	
	}
}

