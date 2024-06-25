import java.util.Stack;

public class ReverseString {

	public static String isPalindrome(String str)
	{
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			stack.push(str.charAt(i));
		}
		StringBuilder reverseString=new StringBuilder();
		while(!stack.isEmpty())
		{
			reverseString.append(stack.pop());
		}
		return reverseString.toString();
	}
	
	public static void main(String[] args) {
		
String s1="radar";
String s2="heelo";
System.out.println(s1+" is palindrome : "+ isPalindrome(s1));
System.out.println(s2+" is palindrome : "+ isPalindrome(s2));
	}

}
