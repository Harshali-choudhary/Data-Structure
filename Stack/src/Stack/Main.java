package Stack;

public class Main {

	public static void main(String[] args) {
		Stack<String> s=new Stack<String>(3);
		s.push("hello");
		s.push("hi");
		s.push("good");
		System.out.println(s.pop());

	}

}
