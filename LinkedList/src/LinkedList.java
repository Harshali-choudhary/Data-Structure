
public class LinkedList {
	
	private node head;

	public node getHead() {
		return head;
	}

	public void setHead(node head) {
		this.head = head;
	}
	
	public boolean insertNode(int data)
	{
		node newnode=new node(data);
		
		if(head==null)
		{
			head=newnode;
			return true;
		}
		node temp=head;
		while(temp.getNext() !=null)
		{
			temp=temp.getNext();
			if(temp.getData()==data)
			{
				return false;
				
			}
		}
		temp.setNext(newnode);
		return true;
	}
	
	public void display()
	{
		node temp=head;
		
		while(temp !=null)
		{
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	public void maximum(LinkedList list)
	{
		
		node temp=list.head;
		int max=temp.getData();
		while(temp!=null)
		{
			if(temp.getData()>max)
			{
				
				max=temp.getData();
			}
			
			
			temp=temp.getNext();
		}
		System.out.println("The maximum element of list is : "+max);
	}
	
	public void minimum(LinkedList list)
	{
		node temp=list.head;
		int min=temp.getData();
		while(temp != null)
		{
			if(temp.getData()<min)
			{
				min=temp.getData();
			}
			temp=temp.getNext();
		}
		System.out.println("The minimum element of the list is : "+min);
	}
	
	public void EvenNo(LinkedList list)
	{
		node temp=list.head;
		
		//int even=temp.getData();
		while(temp!=null)
		{
		    if(temp.getData()%2==0)
		    {
		    	System.out.println(temp.getData());
		    }
		    temp=temp.getNext();
		}
		
	}

}
