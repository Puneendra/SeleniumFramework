package PuniCoreJavaConcepts.Varibles.List;

import java.util.Stack;

public class StackDemo 
{

	public static void main(String[] args) 
	{
	Stack<String> s = new Stack<>();
	//Stack<String> s = new Stack<String>();

		
		//Stack s = new Stack();
		s.push("a");
		s.push("b");
		s.push("c");
		
		System.out.println(s);
		
		System.out.println(s.search("a"));//Retrives OffSet 3
		System.out.println(s.search("Z"));
		

	}

}
