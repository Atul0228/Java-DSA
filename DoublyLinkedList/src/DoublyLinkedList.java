
public class DoublyLinkedList {

	class node{
		int data;
		node next;
		node prev;
		
		 public node(int data) {
			 this.data=data;
			 this.prev=null;
			 this.next=null;
		 }
		}
	node head=null;
	public void addNode(int data) { 
	node newNode=new node(data);
	if(head==null) {
		head=newNode;
		}else {
			
			node temp=head;
			while( temp.next!=null) {
				temp=temp.next;
				
			}
			
			if(temp.next==null)
			{
				temp.next=newNode;
				newNode.prev=temp;
			}
		}
	}
	
	
	public void deletByValue(int val)
	{
		node temp=head;
		
		if(temp.data==val)
		{
			head=temp.next;
			temp.next.next=null;
			temp.next=null;
			
		}else {
			
			while(temp.next!=null && temp.data!=0)
			{
				if(temp.next.data==val)
				{
					temp.next=temp.next.next;
					temp.next.prev=temp;
					temp.next=null;
					temp.next.prev=null
					
				}else {
					temp=temp.next;
				}
			}
		}
	}
	
}
