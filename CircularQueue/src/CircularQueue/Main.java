package CircularQueue;

public class Main {

	public static void main(String[] args) {
     CircularQueue cq=new CircularQueue(4);
     System.out.println("Circular Queue");
     System.out.println(cq.insert(10));
     System.out.println(cq.insert(20));
     System.out.println(cq.insert(30));
     System.out.println(cq.insert(40));
     System.out.println(cq.delete());
     System.out.println(cq.delete());

	}

}
