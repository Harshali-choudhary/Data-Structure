
public class test {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.insertNode(8);
		l.insertNode(1);
		l.insertNode(2);
		l.insertNode(5);
		l.insertNode(7);
		l.insertNode(4);
		//LinkedList l1=l;
		
		l.display();
		
		l.maximum(l);
		l.minimum(l);
        System.out.println("The even number in the list is : ");
        l.EvenNo(l);
	}

}
