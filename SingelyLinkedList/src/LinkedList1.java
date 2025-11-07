
public class LinkedList1 {

	
	class Node{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	public void addNode(int data)
	{
		
		if(head == null)
		{
			Node temp=new Node(data);
			head = temp; 
		}else {
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			
			if(temp.next==null)
			{
				Node temp2=new Node(data);
				temp.next=temp2;
			}
		}
	}
	
	
	public void show()
	{
		if(head==null)
		{
			System.out.println("No Data Present");
		}else {
			Node temp=head;
			
			while(temp!=null)
			{
				System.out.print(temp.data);
				
		    if(temp.next!=null) {
		    	System.out.print("------>");
		    }temp=temp.next;
			}System.out.print("------>null");
		}
	}
	
	
}
