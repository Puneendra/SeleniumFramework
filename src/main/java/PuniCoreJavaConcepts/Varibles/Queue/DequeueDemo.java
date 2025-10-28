package PuniCoreJavaConcepts.Varibles.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo
{

	public static void main(String[] args) 
	{
Deque<Integer> dq = new ArrayDeque<Integer>();
dq.add(3);
dq.addLast(5);
dq.addFirst(4);
dq.offerFirst(2);
dq.offerLast(6);
System.out.println(dq);

System.out.println(dq.pollFirst());

System.out.println(dq.pollLast());
System.out.println(dq);


	}

}
