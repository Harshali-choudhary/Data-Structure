package DoubleStack;

public class Main {
	
	public static void main(String[] args)
	{
		DoubleStack ds=new DoubleStack(4);
		ds.push1(10);
		ds.push2(20);
		ds.push1(30);
		ds.push2(40);
		System.out.println(ds.pop1());
		System.out.println(ds.pop2());
	}

}
